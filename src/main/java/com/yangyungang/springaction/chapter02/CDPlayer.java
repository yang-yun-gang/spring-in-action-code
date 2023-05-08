package com.yangyungang.springaction.chapter02;

/**
 * @Description : CD播放器
 * @Author : young
 * @Date : 2023-04-20 16:09
 * @Version : 1.0
 **/
public class CDPlayer {

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
