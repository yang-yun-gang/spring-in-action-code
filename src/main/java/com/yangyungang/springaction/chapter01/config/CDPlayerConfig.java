package com.yangyungang.springaction.chapter01.config;

import com.yangyungang.springaction.chapter01.CDPlayer;
import com.yangyungang.springaction.chapter01.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description : CDPlayer配置类
 * @Author : young
 * @Date : 2023-04-20 15:25
 * @Version : 1.0
 **/
@Configuration
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(CompactDisc cd) {
        return new CDPlayer(cd);
    }

}
