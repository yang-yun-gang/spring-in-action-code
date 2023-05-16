package com.yangyungang.springaction.chapter03;


import java.util.List;

/**
 * @Description : 黑胶唱片
 * @Author : young
 * @Date : 2023-05-16 16:26
 * @Version : 1.0
 **/
public class BlankDisc implements CompactDisc {

    private String title;

    private String artist;

    // 磁道
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play(int trackNumber) {
        System.out.println("play the number " + trackNumber + " : " + tracks.get(trackNumber));
    }
}
