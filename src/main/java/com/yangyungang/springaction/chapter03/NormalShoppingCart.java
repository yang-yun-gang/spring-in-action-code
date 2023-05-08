package com.yangyungang.springaction.chapter03;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Description : 普通购物车
 * @Author : young
 * @Date : 2023-05-07 16:23
 * @Version : 1.0
 **/

public class NormalShoppingCart implements ShoppingCart{
    @Override
    public void shopping() {
        System.out.println("normal...");
    }
}
