package com.designpattern.Interpreter;

/**
 *  抽象表达式 -- BooleanExp
 *  定义:
 *      BooleanExp -->> VariableExp | Constant | OrExp | AndExp | NotExp | '(' BooleanExp ')'
 *      AndExp -->> BooleanExp 'and' BooleanExp
 *      OrExp -->> BooleanExp 'or' BooleanExp
 *      NotExp -->> BooleanExp 'not' BooleanExp
 *      Constant -->> 'true' | 'false'
 *      VariableExp -->> 'A' | 'B' | ... | 'Z'
 *      
 * @author Json<<json1990@foxmail.com>>
 */
public interface BooleanExp {
	
    public abstract boolean Evaluate(Context c);
    
    public abstract BooleanExp Replace(String var, BooleanExp exp);
    
    public abstract BooleanExp Copy();
}