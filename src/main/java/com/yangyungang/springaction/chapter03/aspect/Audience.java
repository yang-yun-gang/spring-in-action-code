package com.yangyungang.springaction.chapter03.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description : 观众（切面）
 * @Author : young
 * @Date : 2023-05-12 10:14
 * @Version : 1.0
 **/
@Component
@Aspect
public class Audience {

    // 定义切点，后续只需要复用方法即可
    @Pointcut("execution(* com.yangyungang.springaction.chapter03.Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jb) {
        System.out.println("Silencing cell phone...");
        System.out.println("Taking seats...");
        try {
            jb.proceed(); // 调用被通知方法
            System.out.println("CLAP CLAP CLAP!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund...");
            throwable.printStackTrace();
        }
    }

    /*@Before("execution(* com.yangyungang.springaction.chapter03.Performance.perform(..))") // 切点
    public void silenceCellPhone() {
        System.out.println("Silencing cell phone...");
    }

    @Before("execution(* com.yangyungang.springaction.chapter03.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats...");
    }

    @AfterReturning("execution(* com.yangyungang.springaction.chapter03.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!");
    }

    @AfterThrowing("execution(* com.yangyungang.springaction.chapter03.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund...");
    }*/

}
