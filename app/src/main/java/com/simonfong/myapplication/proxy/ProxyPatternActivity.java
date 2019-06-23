package com.simonfong.myapplication.proxy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.proxy.impl.Image;
import com.simonfong.myapplication.proxy.impl.ProxyImage;
import com.simonfong.myapplication.util.LogUtil;

import java.math.BigInteger;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/11.
 */
public class ProxyPatternActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy_pattern);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_load)
    public void onViewClicked() {
        Image image = new ProxyImage("text_10mb.jpg");
        // 图像将从磁盘加载
        image.display();
        LogUtil.e("");
        // 图像不需要从磁盘加载
        image.display();

    }
}
