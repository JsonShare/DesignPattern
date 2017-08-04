package com.designpattern.Memento.undoByMemento;

/**
 * 请求者角色类  -- 下棋人Invoker
 * @author Json<<json1990@foxmail.com>>
 */
public class People {
	private Command command;
	
	public People(Command command){
		this.command = command;
	}
	
	public void executeCreateCommand(){
		command.execute();
	}
	
	public void undoCreateCommand(){
		command.undo();
	}
}
