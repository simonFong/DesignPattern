package com.simonfong.myapplication.simgletonpattern.object;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 * 1、懒汉式，线程不安全
 * <p>
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 */
public class SingleObject1 {
    private static SingleObject1 instance;

    private SingleObject1() {
    }

    public static SingleObject1 getInstance() {
        if (instance == null) {
            instance = new SingleObject1();
        }
        return instance;
    }

    public void showMessage() {
        LogUtil.e("我是单例方法:懒汉式，线程安全");
    }
}
