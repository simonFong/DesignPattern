package com.simonfong.myapplication.interpreterpattern.impl;

/**
 * @author fengzimin
 * Created  on  2019/06/23.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
