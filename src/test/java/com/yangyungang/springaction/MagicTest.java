package com.yangyungang.springaction;

import com.yangyungang.springaction.chapter03.MagicBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description : MagicTest
 * @Author : young
 * @Date : 2023-04-21 15:58
 * @Version : 1.0
 **/
public class MagicTest extends SpringactionApplicationTests{

    @Autowired
    private MagicBean magicBean;

    @Test
    public void test() {
        magicBean.helloMagic();
    }

}
