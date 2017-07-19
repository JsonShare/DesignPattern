package com.designpattern.Command;
/**
 * 具体命令角色类  -- 电视打开命令
 * @author Json
*/
public class TVOnCommand implements Command {
	private TV tv;
	public TVOnCommand(TV tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.on();
	}
}