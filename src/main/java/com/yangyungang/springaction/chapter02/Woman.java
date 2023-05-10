package com.yangyungang.springaction.chapter02;

/**
 * @Description : 女人
 * @Author : young
 * @Date : 2023-04-21 15:21
 * @Version : 1.0
 **/
public class Woman implements Human{
    @Override
    public void hello() {
        System.out.println("hello, i am woman");
    }
}
