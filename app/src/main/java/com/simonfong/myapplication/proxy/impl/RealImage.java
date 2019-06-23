package com.simonfong.myapplication.proxy.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/11.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        LogUtil.e("Loading " + fileName);
    }

    @Override
    public void display() {
        LogUtil.e("Displaying " + fileName);
    }
}
