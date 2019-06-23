package com.simonfong.myapplication.facade;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.facade.impl.ShapeMaker;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/11.
 */
public class FacadePatternActivity extends AppCompatActivity {

    private ShapeMaker mShapeMaker;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade_pattern);
        ButterKnife.bind(this);
        mShapeMaker = new ShapeMaker();
    }

    @OnClick({R.id.btn_circle, R.id.btn_rectangle, R.id.btn_square})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_circle:
                mShapeMaker.drawCircle();
                break;
            case R.id.btn_rectangle:
                mShapeMaker.drawRectangle();
                break;
            case R.id.btn_square:
                mShapeMaker.drawSquare();
                break;
        }
    }
}
