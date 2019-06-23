package com.simonfong.myapplication.bridge;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.bridge.impl.Circle;
import com.simonfong.myapplication.bridge.impl.GreenCircle;
import com.simonfong.myapplication.bridge.impl.RedCircle;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class BridgePatternActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge_pattern);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_red, R.id.btn_green})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_red:
                Circle redCircle = new Circle(100, 100, 10, new RedCircle());
                redCircle.draw();
                break;
            case R.id.btn_green:
                Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());
                greenCircle.draw();
                break;
        }
    }
}
