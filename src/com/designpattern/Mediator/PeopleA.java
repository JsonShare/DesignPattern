package com.designpattern.Mediator;

/**
 * 具体同事类  -- 人员a
 * @author Json<<json1990@foxmail.com>>
 */
public class PeopleA extends People {

	public PeopleA(Mediator mediator,String name) {
		super(mediator, name);
	}
	
	/**
     * 接收消息
     */
    public void receive(String message){
    	System.out.println("【A】收到消息：【"+message+"】");
    }
    
    /**
     * 发送消息
     */
    public void send(String message){
    	System.out.println("【A】发出消息：【"+message+"】");
    }
}
