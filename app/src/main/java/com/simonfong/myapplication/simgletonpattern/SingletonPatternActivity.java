package com.simonfong.myapplication.simgletonpattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.simgletonpattern.object.SingleObject1;
import com.simonfong.myapplication.simgletonpattern.object.SingleObject2;
import com.simonfong.myapplication.simgletonpattern.object.SingleObject3;
import com.simonfong.myapplication.simgletonpattern.object.SingleObject4;
import com.simonfong.myapplication.simgletonpattern.object.SingleObject5;
import com.simonfong.myapplication.simgletonpattern.object.SingleObject6;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created  on  2019/06/08.
 * interface by
 *
 * @author fengzimin
 * <p>
 * 经验之谈：一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
 * 如果涉及到反序列化创建对象时，可以尝试使用第 6  种枚举方式。如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
 */
public class SingletonPatternActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_pattern);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.single1, R.id.single2, R.id.single3, R.id.single4, R.id.single5, R.id.single6})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.single1://懒汉式，线程不安全
                SingleObject1.getInstance().showMessage();
                break;
            case R.id.single2://懒汉式，线程安全
                SingleObject2.getInstance().showMessage();
                break;
            case R.id.single3://饿汉式
                SingleObject3.getInstance().showMessage();
                break;
            case R.id.single4://双检锁/双重校验锁（DCL，即 double-checked locking）
                SingleObject4.getInstance().showMessage();
                break;
            case R.id.single5://登记式/静态内部类
                SingleObject5.getInstance().showMessage();
                break;
            case R.id.single6://枚举
                SingleObject6.INSTANCE.whateverMethod();
                break;
        }
    }
}
