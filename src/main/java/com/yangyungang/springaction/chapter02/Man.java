package com.yangyungang.springaction.chapter02;

/**
 * @Description : 男人
 * @Author : young
 * @Date : 2023-04-21 15:20
 * @Version : 1.0
 **/
public class Man implements Human {
    @Override
    public void hello() {
        System.out.println("hello, i am man");
    }
}
