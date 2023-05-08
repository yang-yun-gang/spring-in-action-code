package com.yangyungang.springaction.chapter03.config;

import com.yangyungang.springaction.chapter03.MagicBean;
import com.yangyungang.springaction.chapter03.MagicExitsLCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Description : MagicConfig
 * @Author : young
 * @Date : 2023-04-21 15:50
 * @Version : 1.0
 **/
@Configuration
public class MagicConfig {

    @Bean
    @Conditional(MagicExitsLCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }

}
