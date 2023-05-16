package com.yangyungang.springaction;

import com.yangyungang.springaction.chapter03.Sing;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description : 表演测试
 * @Author : young
 * @Date : 2023-05-12 10:28
 * @Version : 1.0
 **/
public class PerformanceTest extends SpringactionApplicationTests{

    @Autowired
    private Sing sing;

    @Test
    public void test() {
        sing.perform();
    }
}
