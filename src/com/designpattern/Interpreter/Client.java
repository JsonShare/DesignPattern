package com.designpattern.Interpreter;

/**
 * 客户端测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client  {
    public static void main(String[] args) {
        Context context = new Context();
       
        VariableExp x = new VariableExp("X");
        VariableExp y = new VariableExp("Y");
        VariableExp z = new VariableExp("Z");

        context.Assign("X", true);
        context.Assign("Y", false);
        context.Assign("Z", true);
        
        //测试表达式 ：(z and x) and (y and (not x))
        BooleanExp expression = new AndExp(new AndExp(z, x),new AndExp(y, new NotExp(x)));
        boolean result = expression.Evaluate(context);
        System.out.println("(z and x) and (y and (not x))表达式结果：" + result);
        
        //测试表达式 ：(z and x) or (y and (not x))
        BooleanExp expression1 = new OrExp(new AndExp(z, x),new AndExp(y, new NotExp(x)));
        boolean result1 = expression1.Evaluate(context);
        System.out.println("(z and x) or (y and (not x))表达式结果：" + result1);
    }
}