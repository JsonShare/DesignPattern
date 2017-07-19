package com.designpattern.Command.extend.RequestLog;
/**
 * 具体命令角色类 -- 插入命令
 * @author Json
*/
public class InsertCommand extends Command{
	public InsertCommand(String name) {
		super(name);
	}

	public void execute(String args) {  
        this.args = args;  
        operator.insert(args);  
    }  
      
    public void execute() {  
    	operator.insert(this.args);  
    }  
}
