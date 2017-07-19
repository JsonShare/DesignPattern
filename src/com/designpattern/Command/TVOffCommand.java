package com.designpattern.Command;
/**
 * 具体命令角色类  -- 电视关闭命令
 * @author Json
*/
public class TVOffCommand implements Command {
	private TV tv;
	public TVOffCommand(TV tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.off();
	}
}
