package com.yangyungang.springaction;

import com.yangyungang.springaction.chapter03.CompactDisc;
import com.yangyungang.springaction.chapter03.aspect.TrackCounter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @Description : BlankDisc测试
 * @Author : young
 * @Date : 2023-05-16 17:04
 * @Version : 1.0
 **/
public class BlankDiscTest extends SpringactionApplicationTests {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void test() {
        compactDisc.play(0);
        compactDisc.play(2);
        Map<Integer, Integer> trackCounts = trackCounter.getTrackCounts();
        System.out.println(trackCounts.get(0));
        System.out.println(trackCounts.get(1));
        System.out.println(trackCounts.get(2));

    }
}
