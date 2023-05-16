package com.yangyungang.springaction.chapter03.config;

import com.yangyungang.springaction.chapter03.BlankDisc;
import com.yangyungang.springaction.chapter03.CompactDisc;
import com.yangyungang.springaction.chapter03.aspect.TrackCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 配置类
 * @Author : young
 * @Date : 2023-05-16 16:53
 * @Version : 1.0
 **/
@Configuration
public class BlankDiscConfig {

    @Bean
    public CompactDisc blankDisc() {
        BlankDisc cd = new BlankDisc();
        cd.setTitle("蒲公英的约定");
        cd.setArtist("周杰伦");
        List<String> tracks = new ArrayList<>();
        tracks.add("一起长大的约定");
        tracks.add("那样清晰");
        tracks.add("拉过钩的我相信");
        tracks.add("说好要一起旅行");
        tracks.add("是你如今");
        tracks.add("唯一坚持的任性");
        cd.setTracks(tracks);

        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
