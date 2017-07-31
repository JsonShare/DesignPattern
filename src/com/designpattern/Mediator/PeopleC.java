package com.designpattern.Mediator;

/**
 * 具体同事类  -- 人员c
 * @author Json<<json1990@foxmail.com>>
 */
public class PeopleC extends People {

	public PeopleC(Mediator mediator,String name) {
		super(mediator, name);
	}
	
	/**
     * 接收消息
     */
    public void receive(String message){
    	System.out.println("【C】收到消息：【"+message+"】");
    }
    
    /**
     * 发送消息
     */
    public void send(String message){
    	System.out.println("【C】发出消息：【"+message+"】");
    }
}
