package com.designpattern.Command.extend.RequestLog;
/**
 * 具体命令角色类 -- 删除命令
 * @author Json
*/
public class DeleteCommand extends Command{
	public DeleteCommand(String name) {
		super(name);
	}

	public void execute(String args) {  
        this.args = args;  
        operator.delete(args);  
    }  
      
    public void execute() {  
    	operator.delete(this.args);  
    }  
}