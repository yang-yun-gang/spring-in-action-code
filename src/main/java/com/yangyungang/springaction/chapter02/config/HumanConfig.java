package com.yangyungang.springaction.chapter02.config;

import com.yangyungang.springaction.chapter02.Human;
import com.yangyungang.springaction.chapter02.Man;
import com.yangyungang.springaction.chapter02.Woman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Description : 人类配置类
 * @Author : young
 * @Date : 2023-04-21 15:21
 * @Version : 1.0
 **/
@Configuration
public class HumanConfig {

    @Bean
    @Profile("dev")
    public Human man() {
        return new Man();
    }

    @Bean
    @Profile("pro")
    public Human woman() {
        return new Woman();
    }

}
