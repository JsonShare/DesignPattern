package com.designpattern.Command.extend.CommandQueue;
/**
 * 请求发送者类Manager针对CommandQueue编程
 * @author Json
*/
public class Manager {
	private CommandQueue commandQueue; //维持一个CommandQueue对象的引用    
	 
	//构造注入    
	public Manager(CommandQueue commandQueue) {
	    this. commandQueue = commandQueue;    
	}    
	    
	//设值注入    
	public void setCommandQueue(CommandQueue commandQueue) {    
	    this.commandQueue = commandQueue;    
	}    
	    
	//调用CommandQueue类的execute()方法    
	public void call() {    
	    commandQueue.execute();    
	}    
}
