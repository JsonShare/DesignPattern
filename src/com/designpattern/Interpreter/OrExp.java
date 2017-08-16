package com.designpattern.Interpreter;

/**
 * 非终结符表达式 -- or
 * @author Json<<json1990@foxmail.com>>
 */
public class OrExp implements BooleanExp {
    private BooleanExp operor1;
    private BooleanExp operor2;
    
    public OrExp(BooleanExp oper1, BooleanExp oper2) {
        operor1 = oper1;
        operor2 = oper2;
    }

    public boolean Evaluate(Context c) {
        return operor1.Evaluate(c) || operor2.Evaluate(c);
    }

    public BooleanExp Copy() {
        return new OrExp(operor1.Copy(), operor2.Copy());
    }

    public BooleanExp Replace(String var, BooleanExp exp) {
        return new OrExp(operor1.Replace(var, exp),operor2.Replace(var, exp));
    }
}