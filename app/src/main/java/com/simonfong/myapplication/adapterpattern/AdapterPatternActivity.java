package com.simonfong.myapplication.adapterpattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 *
 */
public class AdapterPatternActivity extends AppCompatActivity {

    private AudioPlayer audioPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_pattern);
        ButterKnife.bind(this);
        audioPlayer = new AudioPlayer();
    }

    @OnClick({R.id.btn_mp3, R.id.btn_mp4, R.id.btn_vlc, R.id.btn_avi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_mp3:
                audioPlayer.play("mp3", "beyond the horizon.mp3");
                break;
            case R.id.btn_mp4:
                audioPlayer.play("mp4", "alone.mp4");
                break;
            case R.id.btn_vlc:
                audioPlayer.play("vlc", "far far away.vlc");
                break;
            case R.id.btn_avi:
                audioPlayer.play("avi", "mind me.avi");
                break;
        }
    }
}
