package com.simonfong.myapplication.decorator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.decorator.impl.Circle;
import com.simonfong.myapplication.decorator.impl.Rectangle;
import com.simonfong.myapplication.decorator.impl.RedShapeDecorator;
import com.simonfong.myapplication.decorator.impl.Shape;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/11.
 */
public class DecoratorPatternActivity extends AppCompatActivity {

    private Shape mCircle;
    private RedShapeDecorator mRedCircle;
    private RedShapeDecorator mRedRectangle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator_pattern);
        ButterKnife.bind(this);
        mCircle = new Circle();
        mRedCircle = new RedShapeDecorator(new Circle());
        mRedRectangle = new RedShapeDecorator(new Rectangle());

    }

    @OnClick({R.id.btn_circle, R.id.btn_red_circle, R.id.btn_red_rectangle})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_circle:
                mCircle.draw();
                break;
            case R.id.btn_red_circle:
                mRedCircle.draw();
                break;
            case R.id.btn_red_rectangle:
                mRedRectangle.draw();
                break;
        }
    }
}
