package com.yangyungang.springaction;

import com.yangyungang.springaction.chapter01.CDPlayer;
import com.yangyungang.springaction.chapter01.CompactDisc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description : CDPlayer测试
 * @Author : young
 * @Date : 2023-04-19 17:44
 * @Version : 1.0
 **/

public class CDPlayerTest extends SpringactionApplicationTests{

    @Autowired
    private CompactDisc cd;

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void cdShouldNotBeNull() {
        cd.play();
    }

    @Test
    public void play() {
        cdPlayer.play();
    }
}
