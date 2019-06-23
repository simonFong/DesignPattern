package com.simonfong.myapplication.proxy.impl;

/**
 * @author fengzimin
 * Created  on  2019/06/11.
 */
public class ProxyImage implements Image {
    private String fileName;
    private RealImage mRealImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (mRealImage == null) {
            mRealImage = new RealImage(fileName);
        }
        mRealImage.display();
    }
}
