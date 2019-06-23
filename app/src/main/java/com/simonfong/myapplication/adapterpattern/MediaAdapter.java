package com.simonfong.myapplication.adapterpattern;

import com.simonfong.myapplication.adapterpattern.impl.AdvancedMediaPlayer;
import com.simonfong.myapplication.adapterpattern.impl.MediaPlayer;
import com.simonfong.myapplication.adapterpattern.impl.Mp4Player;
import com.simonfong.myapplication.adapterpattern.impl.VlcPlayer;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer mAdvancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            mAdvancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mAdvancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            mAdvancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mAdvancedMediaPlayer.playMp4(fileName);
        }
    }
}
