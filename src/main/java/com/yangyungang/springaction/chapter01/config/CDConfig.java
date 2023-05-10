package com.yangyungang.springaction.chapter01.config;

import com.yangyungang.springaction.chapter01.CompactDisc;
import com.yangyungang.springaction.chapter01.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description : CDPlayer配置类
 * @Author : young
 * @Date : 2023-04-20 16:55
 * @Version : 1.0
 **/
@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
