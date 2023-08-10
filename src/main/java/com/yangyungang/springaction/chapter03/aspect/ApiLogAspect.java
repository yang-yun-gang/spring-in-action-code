package com.yangyungang.springaction.chapter03.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Description : api日志切面
 * @Author : young
 * @Date : 2023-08-10 22:30
 * @Version : 1.0
 **/
@Component
@Aspect
public class ApiLogAspect {

    private static final Logger log = LoggerFactory.getLogger(ApiLogAspect.class);

    @Pointcut("@annotation(com.yangyungang.springaction.chapter03.anno.ApiLog)")
    private void apiLogPointCut() {
    }

    @Around("apiLogPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        //Log logAnnotation = method.getAnnotation(Log.class);

        // 类名
        String className = joinPoint.getTarget().getClass().getName();
        // 方法名
        String methodName = signature.getName();
        // 参数
        Object[] args = joinPoint.getArgs();



        //String logDesc = StrUtil.isBlank(logAnnotation.value()) ? "未知方法" : logAnnotation.value();

        log.info("the api method ({}:{}) called...", className, methodName);
        for (Object arg : args) {
            log.info("request param：{}", JSON.toJSONString(arg));
        }
        Object result = joinPoint.proceed();
        log.info("the api ({}:{}) method return: {}", className, methodName, JSON.toJSONString(result));

        return result;
    }
}
