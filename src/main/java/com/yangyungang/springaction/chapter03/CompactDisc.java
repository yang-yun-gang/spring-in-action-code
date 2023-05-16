package com.yangyungang.springaction.chapter03;

/**
 *@Description : CD接口
 *@Author : young
 *@Date : 2023-04-19 15:44
 *@Version : 1.0
 **/
public interface CompactDisc {

    /**
      * @Description: 播放第几个磁道
      * @Author: young
      * @Date: 2023-05-16 16:45
      * @Param trackNumber: 磁道号
      * @return: void
      * @Version: 1.0
      **/
    void play(int trackNumber);

}
