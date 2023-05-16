package com.yangyungang.springaction.chapter03;

import org.springframework.stereotype.Component;

/**
 * @Description : 唱歌
 * @Author : young
 * @Date : 2023-05-12 10:20
 * @Version : 1.0
 **/
@Component
public class Sing implements Performance{
    @Override
    public void perform() {
        System.out.println("Sing...");
    }
}
