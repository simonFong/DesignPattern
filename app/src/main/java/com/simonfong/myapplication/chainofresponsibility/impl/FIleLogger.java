package com.simonfong.myapplication.chainofresponsibility.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/23.
 */
public class FIleLogger extends AbstractLogger {
    public FIleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        LogUtil.e("File::Logger: " + message);
    }
}
