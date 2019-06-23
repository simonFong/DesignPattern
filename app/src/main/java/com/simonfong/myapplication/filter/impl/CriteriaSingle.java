package com.simonfong.myapplication.filter.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengzimin
 * Created  on  2019/06/10.
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons  = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("Single")) {
                singlePersons .add(person);
            }
        }
        return singlePersons ;
    }
}
