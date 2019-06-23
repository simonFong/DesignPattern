package com.simonfong.myapplication.adapterpattern.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        LogUtil.e("Playing mp4 file. Name: "+ fileName);
    }
}
