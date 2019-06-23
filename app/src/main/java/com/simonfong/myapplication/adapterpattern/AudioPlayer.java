package com.simonfong.myapplication.adapterpattern;

import com.simonfong.myapplication.adapterpattern.impl.MediaPlayer;
import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mMediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            LogUtil.e("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mMediaAdapter = new MediaAdapter(audioType);
            mMediaAdapter.play(audioType, fileName);
        } else {
            LogUtil.e("Invalid media. " + audioType + " format not supported");
        }
    }
}
