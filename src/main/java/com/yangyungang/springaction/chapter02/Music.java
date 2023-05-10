package com.yangyungang.springaction.chapter02;

/**
 * @Description : 音乐类
 * @Author : young
 * @Date : 2023-05-09 9:47
 * @Version : 1.0
 **/

public class Music {

    private String name;

    private String author;

    public Music(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void play() {
        System.out.println("play the music "+ name + ", author is " + author);
    }
}
