package com.yangyungang.springaction.chapter02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description : 电影类
 * @Author : young
 * @Date : 2023-05-08 11:16
 * @Version : 1.0
 **/
@Component
public class Movie {

    private String name;

    private String director;

    public Movie(@Value("${movie.name}") String name,
                 @Value("${movie.director}") String director) {
        this.name = name;
        this.director = director;
    }

    public void play() {
        System.out.println("play the movie "+ name + ", director by " + director);
    }
}
