package com.simonfong.myapplication.filter.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengzimin
 * Created  on  2019/06/10.
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("female")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
