package com.designpattern.Command.extend.RequestLog;
/**
 * 具体命令角色类 -- 修改命令
 * @author Json
*/
public class UpdateCommand extends Command{
	public UpdateCommand(String name) {
		super(name);
	}

	public void execute(String args) {  
        this.args = args;  
        operator.update(args);  
    }  
      
    public void execute() {  
    	operator.update(this.args);  
    }  
}
