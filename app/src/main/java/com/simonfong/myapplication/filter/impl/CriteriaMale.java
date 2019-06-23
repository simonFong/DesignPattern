package com.simonfong.myapplication.filter.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengzimin
 * Created  on  2019/06/10.
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
