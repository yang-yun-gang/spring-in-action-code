package com.yangyungang.springaction.chapter02.config;

import com.yangyungang.springaction.chapter02.NormalShoppingCart;
import com.yangyungang.springaction.chapter02.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Description : 购物车配置类
 * @Author : young
 * @Date : 2023-05-07 16:26
 * @Version : 1.0
 **/
@Configuration
public class ShoppingCartConfig {

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
    public ShoppingCart shoppingCart() {
        return new NormalShoppingCart();
    }

}
