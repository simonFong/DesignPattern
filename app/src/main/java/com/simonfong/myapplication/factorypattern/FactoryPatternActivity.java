package com.simonfong.myapplication.factorypattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.simonfong.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public class FactoryPatternActivity extends AppCompatActivity {
    @BindView(R.id.btn_circle)
    Button mBtnCircle;
    @BindView(R.id.btn_rectangle)
    Button mBtnRectangle;
    @BindView(R.id.btn_square)
    Button mBtnSquare;
    private ShapeFactory mShapeFactory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_pattern);
        ButterKnife.bind(this);
        mShapeFactory = new ShapeFactory();
    }

    @OnClick({R.id.btn_circle, R.id.btn_rectangle, R.id.btn_square})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_circle:
                mShapeFactory.getShape(ShapeFactory.TYPE.CIRCLE).draw();
                break;
            case R.id.btn_rectangle:
                mShapeFactory.getShape(ShapeFactory.TYPE.RECTANGLE).draw();
                break;
            case R.id.btn_square:
                mShapeFactory.getShape(ShapeFactory.TYPE.SQUARE).draw();
                break;
            default:
        }
    }
}
