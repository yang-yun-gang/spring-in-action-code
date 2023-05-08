package com.yangyungang.springaction;

import com.yangyungang.springaction.chapter03.Dessert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Description : 甜点测试
 * @Author : young
 * @Date : 2023-05-06 9:56
 * @Version : 1.0
 **/
public class DessertTest extends SpringactionApplicationTests{

    private Dessert dessert;

    @Autowired
    @Qualifier("cakeA")
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Test
    public void test() {
        dessert.eat();
    }
}
