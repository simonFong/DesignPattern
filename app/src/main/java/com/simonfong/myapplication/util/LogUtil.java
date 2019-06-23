package com.simonfong.myapplication.util;

import android.util.Log;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public class LogUtil {
    public static void e(String s) {

        StackTraceElement e = Thread.currentThread().getStackTrace()[4];
        String fileName = e.getFileName();
        int lineNum = e.getLineNumber();
        String methodName = e.getMethodName();

        StringBuilder sb = new StringBuilder();

        sb.append(methodName)
                .append('(')
                .append(fileName)
                .append(':')
                .append(lineNum)
                .append(')')
                .append(s);

        s = sb.toString();

        sb.delete(0, sb.length());

        String className = e.getClassName();
        int index = className.lastIndexOf('.') + 1;
        sb.append(className, index, className.length());

        String tag = sb.toString();

        Log.e(tag, s);


    }
}
