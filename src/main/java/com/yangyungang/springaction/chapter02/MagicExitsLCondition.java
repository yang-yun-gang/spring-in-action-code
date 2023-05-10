package com.yangyungang.springaction.chapter02;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Description : MagicExitsLCondition
 * @Author : young
 * @Date : 2023-04-21 15:47
 * @Version : 1.0
 **/
public class MagicExitsLCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        return env.containsProperty("magic");
    }
}
