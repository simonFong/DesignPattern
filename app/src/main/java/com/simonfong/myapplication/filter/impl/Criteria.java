package com.simonfong.myapplication.filter.impl;

import java.util.List;

/**
 * @author fengzimin
 * Created  on  2019/06/10.
 */
public interface Criteria {
     List<Person> meetCriteria(List<Person> persons);
}
