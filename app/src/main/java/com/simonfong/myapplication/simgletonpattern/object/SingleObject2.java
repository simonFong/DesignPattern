package com.simonfong.myapplication.simgletonpattern.object;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 * <p>
 * 2、懒汉式，线程安全
 * <p>
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
public class SingleObject2 {
    private static SingleObject2 instance;

    private SingleObject2() {
    }

    public static synchronized SingleObject2 getInstance() {
        if (instance == null) {
            instance = new SingleObject2();
        }
        return instance;
    }

    public void showMessage() {
        LogUtil.e("我是单例方法:懒汉式，线程安全");
    }
}
