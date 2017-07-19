package com.designpattern.Command.extend.Undo;
/**
 * 请求者
 * @author Json
*/
public class RequestMakeDir {
	Command createCommand;
	public void setCreateCommand(Command command) {
		this.createCommand = command;
	}
	
	public void executeCreateCommand(){
		createCommand.execute();
	}
	
	public void undoCreateCommand(){
		createCommand.undo();
	}
}
