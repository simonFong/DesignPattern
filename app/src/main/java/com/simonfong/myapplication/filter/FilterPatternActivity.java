package com.simonfong.myapplication.filter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.filter.impl.AndCriteria;
import com.simonfong.myapplication.filter.impl.CriteriaFemale;
import com.simonfong.myapplication.filter.impl.CriteriaMale;
import com.simonfong.myapplication.filter.impl.CriteriaSingle;
import com.simonfong.myapplication.filter.impl.OrCriteria;
import com.simonfong.myapplication.filter.impl.Person;
import com.simonfong.myapplication.util.LogUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/09.
 */
public class FilterPatternActivity extends AppCompatActivity {

    private List<Person> mPersons;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_pattern);
        ButterKnife.bind(this);

        mPersons = new ArrayList<Person>();

        mPersons.add(new Person("Robert", "Male", "Single"));
        mPersons.add(new Person("John", "Male", "Married"));
        mPersons.add(new Person("Laura", "Female", "Married"));
        mPersons.add(new Person("Diana", "Female", "Single"));
        mPersons.add(new Person("Mike", "Male", "Single"));
        mPersons.add(new Person("Bobby", "Male", "Single"));
    }

    @OnClick({R.id.btn_male, R.id.btn_female, R.id.btn_single, R.id.btn_and, R.id.btn_or})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_male:
                CriteriaMale criteriaMale = new CriteriaMale();
                List<Person> people = criteriaMale.meetCriteria(mPersons);
                for (Person person : people) {
                    LogUtil.e(person.toString());
                }
                break;
            case R.id.btn_female:
                CriteriaFemale criteriaFemale = new CriteriaFemale();
                for (Person meetCriterion : criteriaFemale.meetCriteria(mPersons)) {
                    LogUtil.e(meetCriterion.toString());
                }
                break;
            case R.id.btn_single:
                for (Person meetCriterion : new CriteriaSingle().meetCriteria(mPersons)) {
                    LogUtil.e(meetCriterion.toString());
                }
                break;
            case R.id.btn_and:
                CriteriaMale male = new CriteriaMale();
                CriteriaSingle single = new CriteriaSingle();
                for (Person meetCriterion : new AndCriteria(male, single).meetCriteria(mPersons)) {
                    LogUtil.e(meetCriterion.toString());
                }
                break;
            case R.id.btn_or:
                CriteriaFemale female = new CriteriaFemale();
                CriteriaSingle single1 = new CriteriaSingle();
                for (Person meetCriterion : new OrCriteria(female, single1).meetCriteria(mPersons)) {
                    LogUtil.e(meetCriterion.toString());
                }
                break;
        }
    }
}
