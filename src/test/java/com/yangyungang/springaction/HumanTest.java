package com.yangyungang.springaction;

import com.yangyungang.springaction.chapter03.Human;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description : Human测试
 * @Author : young
 * @Date : 2023-04-21 15:23
 * @Version : 1.0
 **/
//@ActiveProfiles("dev")
public class HumanTest extends SpringactionApplicationTests{

    @Autowired
    private Human human;

    @Test
    public void getHuman() {
        human.hello();
    }
}
