package com.yangyungang.springaction;

import com.yangyungang.springaction.chapter03.Movie;
import com.yangyungang.springaction.chapter03.Music;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description : 电影测试
 * @Author : young
 * @Date : 2023-05-08 11:36
 * @Version : 1.0
 **/
public class MovieTest extends SpringactionApplicationTests{

    @Autowired
    private Movie movie;

    @Autowired
    private Music music;

    @Test
    public void test() {
        movie.play();
        music.play();
    }

}
