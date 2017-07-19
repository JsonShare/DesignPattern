package com.designpattern.Command.extend.RequestLog;

import java.io.Serializable;

/**
 * 抽象命令类，由于需要将命令对象写入文件，因此它实现了Serializable接口  
 * @author Json
*/
public abstract class Command implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected String name; //命令名称 
    protected String args; //命令参数  
    protected Operator operator; //接收者对象
      
    public Command(String name) {  
        this.name = name;
    }  
      
    public String getName() {  
        return this.name;  
    }  
      
    public void setName(String name) {  
        this.name = name;  
    }  
      
    public void setOperator(Operator operator) {  
        this.operator = operator;  
    }  
    
    //声明两个抽象的执行方法execute()  
  	public abstract void execute(String args);  
  	public abstract void execute();
}
