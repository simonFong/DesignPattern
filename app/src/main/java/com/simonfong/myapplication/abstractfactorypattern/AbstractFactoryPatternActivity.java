package com.simonfong.myapplication.abstractfactorypattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.abstractfactorypattern.factory.AbstractFactory;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public class AbstractFactoryPatternActivity extends AppCompatActivity {
    @BindView(R.id.btn_circle)
    Button mBtnCircle;
    @BindView(R.id.btn_rectangle)
    Button mBtnRectangle;
    @BindView(R.id.btn_square)
    Button mBtnSquare;
    @BindView(R.id.btn_red)
    Button mBtnRed;
    @BindView(R.id.btn_green)
    Button mBtnGreen;
    @BindView(R.id.btn_blue)
    Button mBtnBlue;
    private AbstractFactory mShapeFactory;
    private AbstractFactory mColorFactory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory_pattren);
        ButterKnife.bind(this);
        mShapeFactory = FactoryProducer.getFactory("SHAPE");
        mColorFactory = FactoryProducer.getFactory("COLOR");
    }

    @OnClick({R.id.btn_circle, R.id.btn_rectangle, R.id.btn_square, R.id.btn_red, R.id.btn_green, R.id.btn_blue})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_circle:
                mShapeFactory.getShape("CIRCLE").draw();
                break;
            case R.id.btn_rectangle:
                mShapeFactory.getShape("RECTANGLE").draw();
                break;
            case R.id.btn_square:
                mShapeFactory.getShape("SQUARE").draw();
                break;
            case R.id.btn_red:
                mColorFactory.getColor("RED").fill();
                break;
            case R.id.btn_green:
                mColorFactory.getColor("GREEN").fill();
                break;
            case R.id.btn_blue:
                mColorFactory.getColor("BLUE").fill();
                break;
        }
    }
}
