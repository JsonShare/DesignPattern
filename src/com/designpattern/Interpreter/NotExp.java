package com.designpattern.Interpreter;

/**
 * 非终结符表达式 -- not
 * @author Json<<json1990@foxmail.com>>
 */
public class NotExp implements BooleanExp {
    private BooleanExp opernot1;
    
    public NotExp(BooleanExp oper1) {
        opernot1 = oper1;
    }

    public boolean Evaluate(Context c) {
        return !(opernot1.Evaluate(c));
    }

    public BooleanExp Copy() {
        return new NotExp(opernot1.Copy());
    }

    public BooleanExp Replace(String var, BooleanExp exp) {
        return new NotExp(opernot1.Replace(var, exp));
    }
}