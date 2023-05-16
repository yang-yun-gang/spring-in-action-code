package com.yangyungang.springaction.chapter03.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description : 磁道记录
 * @Author : young
 * @Date : 2023-05-16 16:32
 * @Version : 1.0
 **/
@Aspect
public class TrackCounter {

    private Map<Integer, Integer> trackCounts = new ConcurrentHashMap<>();

    @Pointcut("execution(* com.yangyungang.springaction.chapter03.CompactDisc.play(int)) " + "&& args(trackNumber)")
    public void trackPlayed(int trackNumber) {}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    private int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }

    public Map<Integer, Integer> getTrackCounts() {
        return trackCounts;
    }
}
