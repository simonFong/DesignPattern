package com.simonfong.myapplication.builderpattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.builderpattern.food.Meal;
import com.simonfong.myapplication.util.LogUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 *
 * 例子：StringBuilder
 */
public class BuilderPatternActivity extends AppCompatActivity {

    private MealBuilder mMealBuilder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_pattern);
        ButterKnife.bind(this);
        mMealBuilder = new MealBuilder();
    }

    @OnClick({R.id.taocan1, R.id.taocan2, R.id.taocan3, R.id.taocan4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.taocan1:
                LogUtil.e("套餐1");
                Meal meal = mMealBuilder.prepareNonVegMeal();
                meal.showItems();
                LogUtil.e("总金额：" + meal.getCost());
                break;
            case R.id.taocan2:
                LogUtil.e("套餐2");
                Meal meal1 = mMealBuilder.prepareVegMeal();
                meal1.showItems();
                LogUtil.e("总金额：" + meal1.getCost());
                break;
            case R.id.taocan3:
                LogUtil.e("套餐3");
                Meal meal2 = mMealBuilder.prepareMeal3();
                meal2.showItems();
                LogUtil.e("总金额：" + meal2.getCost());
                break;
            case R.id.taocan4:
                LogUtil.e("套餐4");
                Meal meal3 = mMealBuilder.prepareMeal4();
                meal3.showItems();
                LogUtil.e("总金额：" + meal3.getCost());
                break;
        }
    }
}
