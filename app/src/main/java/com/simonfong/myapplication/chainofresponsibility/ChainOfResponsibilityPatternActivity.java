package com.simonfong.myapplication.chainofresponsibility;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.chainofresponsibility.impl.AbstractLogger;
import com.simonfong.myapplication.chainofresponsibility.impl.ConsoleLogger;
import com.simonfong.myapplication.chainofresponsibility.impl.ErrorLogger;
import com.simonfong.myapplication.chainofresponsibility.impl.FIleLogger;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/20.
 */
public class ChainOfResponsibilityPatternActivity extends AppCompatActivity {

    private AbstractLogger chainOfLoggers;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_of_responsibility);
        ButterKnife.bind(this);
        chainOfLoggers = getChainOfLoggers();

    }

    private static AbstractLogger getChainOfLoggers() {
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FIleLogger fIleLogger = new FIleLogger(AbstractLogger.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fIleLogger);
        fIleLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    @OnClick({R.id.btn_info, R.id.btn_debug, R.id.btn_error})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_info:
                chainOfLoggers.logMessage(AbstractLogger.INFO, "This is an information.");
                break;
            case R.id.btn_debug:
                chainOfLoggers.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
                break;
            case R.id.btn_error:
                chainOfLoggers.logMessage(AbstractLogger.ERROR, "This is an error information.");
                break;
        }
    }
}
