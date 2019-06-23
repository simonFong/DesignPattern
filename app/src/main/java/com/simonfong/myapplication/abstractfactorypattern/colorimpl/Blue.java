package com.simonfong.myapplication.abstractfactorypattern.colorimpl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public class Blue implements Color{

    @Override
    public void fill() {
        LogUtil.e("Inside Blue::fill() method.");
    }
}
