package com.designpattern.Command.extend.MultiUndo;
/**
 * 请求者
 * @author Json
*/
public class RequestMakeDir {
	Command createCommand;
	public void setCreateCommand(Command command) {
		this.createCommand = command;
	}
	
	public void executeCreateCommand(String dirName){
		createCommand.execute(dirName);
	}
	
	public void undoCreateCommand(){
		createCommand.undo();
	}
}
