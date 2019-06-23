package com.simonfong.myapplication.chainofresponsibility.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/23.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        LogUtil.e("Standard Console::Logger: " + message);
    }
}
