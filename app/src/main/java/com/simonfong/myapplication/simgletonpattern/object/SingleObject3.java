package com.simonfong.myapplication.simgletonpattern.object;

import com.simonfong.myapplication.util.LogUtil;

/**
 * Created  on  2019/06/08.
 * interface by
 *
 * @author fengzimin
 *
 * 饿汉式
 * <p>
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * 它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法，
 * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
 */
public class SingleObject3 {
    private static SingleObject3 instance = new SingleObject3();

    private SingleObject3() {
    }

    public static SingleObject3 getInstance() {
        return instance;
    }

    public void showMessage() {
        LogUtil.e("我是单例方法:饿汉式");
    }
}
