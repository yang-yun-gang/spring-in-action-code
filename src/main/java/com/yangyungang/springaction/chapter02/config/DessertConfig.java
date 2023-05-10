package com.yangyungang.springaction.chapter02.config;

import com.yangyungang.springaction.chapter02.Cake;
import com.yangyungang.springaction.chapter02.Dessert;
import com.yangyungang.springaction.chapter02.IceCream;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Description : 甜点配置
 * @Author : young
 * @Date : 2023-05-06 10:45
 * @Version : 1.0
 **/
@Configuration
public class DessertConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Dessert cakeA() {
        return new Cake();
    }

    @Bean
    @Qualifier("cold")
    public Dessert iceCream() {
        return new IceCream();
    }
}
