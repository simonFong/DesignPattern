package com.simonfong.myapplication.flyweight;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.flyweight.impl.Circle;
import com.simonfong.myapplication.flyweight.impl.ShapeFactory;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/11.
 */
public class FlyweightPatternActivity extends AppCompatActivity {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyweight_pattern);
        ButterKnife.bind(this);

    }

    private static String getRandowColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    @OnClick(R.id.btn_draw)
    public void onViewClicked() {
        Circle circle = (Circle) ShapeFactory.getCircle(getRandowColor());
        circle.setX(getRandomX());
        circle.setY(getRandomY());
        circle.draw();
    }
}
