package com.simonfong.myapplication.composite;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.composite.bean.Employee;
import com.simonfong.myapplication.util.LogUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/11.
 */
public class CompositePatternActivity extends AppCompatActivity {

    private Employee mCEO;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composite_pattern);
        ButterKnife.bind(this);
        mCEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
        mCEO.add(headSales);
        mCEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

    }

    @OnClick(R.id.btn_print_all)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_print_all:
                LogUtil.e(mCEO.toString());
                for (Employee subordinate : mCEO.getSubordinates()) {
                    LogUtil.e(subordinate.toString());
                    for (Employee subordinateSubordinate : subordinate.getSubordinates()) {
                        LogUtil.e(subordinateSubordinate.toString());
                    }
                }
                break;
            default:
        }
    }
}
