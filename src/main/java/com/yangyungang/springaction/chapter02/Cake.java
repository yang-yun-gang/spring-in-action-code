package com.yangyungang.springaction.chapter02;

/**
 * @Description : 蛋糕
 * @Author : young
 * @Date : 2023-05-06 9:53
 * @Version : 1.0
 **/

public class Cake implements Dessert{
    @Override
    public void eat() {
        System.out.println("eat cake...");
    }
}
