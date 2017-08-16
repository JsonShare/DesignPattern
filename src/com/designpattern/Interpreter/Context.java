package com.designpattern.Interpreter;

import java.util.Hashtable;

/**
 * 上下文
 * @author Json<<json1990@foxmail.com>>
 */
public class Context  {
    private Hashtable<String, Boolean> context = new Hashtable<String, Boolean>();
    
    public void Assign(String name, boolean val) {
        context.put(name, new Boolean(val));
    }
    
    public boolean LookUp(String name) {
        return ((Boolean)context.get(name)).booleanValue();
    }
    
    public Context() {
    }
}