package com.simonfong.myapplication.prototypepattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.prototypepattern.impl.Shape;
import com.simonfong.myapplication.util.LogUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 */
public class PrototypePatternActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype_pattern);
        ButterKnife.bind(this);
        ShapeCache.loadCache();
    }

    @OnClick({R.id.btn_shape1, R.id.btn_shape2, R.id.btn_shape3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_shape1:
                Shape shape = ShapeCache.getShape("1");
                LogUtil.e("Shape:" + shape.getType());
                break;
            case R.id.btn_shape2:
                Shape shape2 = ShapeCache.getShape("2");
                LogUtil.e("Shape:" + shape2.getType());
                break;
            case R.id.btn_shape3:
                Shape shape3 = ShapeCache.getShape("3");
                LogUtil.e("Shape:" + shape3.getType());
                break;
        }
    }
}
