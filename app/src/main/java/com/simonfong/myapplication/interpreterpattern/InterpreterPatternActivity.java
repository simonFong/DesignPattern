package com.simonfong.myapplication.interpreterpattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simonfong.myapplication.R;
import com.simonfong.myapplication.interpreterpattern.impl.AndExpression;
import com.simonfong.myapplication.interpreterpattern.impl.Expression;
import com.simonfong.myapplication.interpreterpattern.impl.OrExpression;
import com.simonfong.myapplication.interpreterpattern.impl.TerminalExpression;
import com.simonfong.myapplication.util.LogUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fengzimin
 * Created  on  2019/06/23.
 */
public class InterpreterPatternActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpreter_pattern);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_shape1, R.id.btn_shape2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_shape1:
                Expression maleExpression = getMaleExpression();
                LogUtil.e("John is male? " + maleExpression.interpret("John"));
                break;
            case R.id.btn_shape2:
                Expression marriedWomanExpression = getMarriedWomanExpression();
                LogUtil.e("Julie is a married women? "+ marriedWomanExpression.interpret("Married Julie"));
                break;
        }
    }

    /**
     * 规则：Robert和John是男性
     *
     * @return
     */
    private Expression getMaleExpression() {
        TerminalExpression robert = new TerminalExpression("Robert");
        TerminalExpression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /**
     * 规则：Julie是一个已婚的女性
     *
     * @return
     */
    private Expression getMarriedWomanExpression() {
        TerminalExpression julie = new TerminalExpression("Julie");
        TerminalExpression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
