package com.yangyungang.springaction.chapter03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description : 超市服务
 * @Author : young
 * @Date : 2023-05-07 16:47
 * @Version : 1.0
 **/
@Service
public class StoreService {

    private ShoppingCart shoppingCart;

    @Autowired
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
