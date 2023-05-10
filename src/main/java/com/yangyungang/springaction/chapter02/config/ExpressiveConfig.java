package com.yangyungang.springaction.chapter02.config;

import com.yangyungang.springaction.chapter02.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Description : 配置
 * @Author : young
 * @Date : 2023-05-08 11:30
 * @Version : 1.0
 **/
@Configuration
@PropertySource("classpath:/param.properties")
public class ExpressiveConfig {

    @Autowired
    private Environment env;

    @Bean
    public Music music() {
        return new Music(env.getProperty("music.name"), env.getProperty("music.author"));
    }

}
