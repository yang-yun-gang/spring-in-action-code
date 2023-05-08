package com.yangyungang.springaction.chapter02;

/**
 * @Description : SgtPeppers这张CD
 * @Author : young
 * @Date : 2023-04-19 15:47
 * @Version : 1.0
 **/
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt, Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
