package com.designpattern.Interpreter;

/**
 * 非终结符表达式 -- and
 * @author Json<<json1990@foxmail.com>>
 */
public class AndExp implements BooleanExp {
    private BooleanExp operand1;
    private BooleanExp operand2;
    
    public AndExp(BooleanExp oper1, BooleanExp oper2) {
        operand1 = oper1;
        operand2 = oper2;
    }

    public boolean Evaluate(Context c) {
        return operand1.Evaluate(c) && operand2.Evaluate(c);
    }

    public BooleanExp Copy() {
        return new AndExp(operand1.Copy(), operand2.Copy());
    }

    public BooleanExp Replace(String var, BooleanExp exp) {
        return new AndExp(operand1.Replace(var, exp),operand2.Replace(var, exp));
    }
}