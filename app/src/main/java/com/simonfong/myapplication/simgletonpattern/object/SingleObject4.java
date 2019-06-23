package com.simonfong.myapplication.simgletonpattern.object;

import com.simonfong.myapplication.util.LogUtil;

/**
 * Created  on  2019/06/08.
 * interface by
 *
 * @author fengzimin
 *
 * 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class SingleObject4 {
    private volatile static SingleObject4 instance ;

    private SingleObject4() {
    }

    public static SingleObject4 getInstance() {
        if(instance==null) {
            synchronized (SingleObject4.class){
                if(instance==null) {
                    instance = new SingleObject4();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        LogUtil.e("我是单例方法:双检锁/双重校验锁");
    }
}
