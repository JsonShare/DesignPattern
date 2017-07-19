package com.designpattern.Command;
/**
 * 请求者角色类  -- 遥控器Invoker
 * @author Json
*/
public class RemoteControl {
	private Command onCommand,offCommand;
	
	public RemoteControl(Command _on,Command _off){
		this.onCommand = _on;
		this.offCommand = _off;
	}
	
	public void turnOn(){
		onCommand.execute();
	}
	
	public void turnOff(){
		offCommand.execute();
	}
}
