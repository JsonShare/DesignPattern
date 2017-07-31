package com.designpattern.Mediator;

/**
 * 具体同事类  -- 人员b
 * @author Json<<json1990@foxmail.com>>
 */
public class PeopleB extends People {

	public PeopleB(Mediator mediator,String name) {
		super(mediator, name);
	}
	
	/**
     * 接收消息
     */
    public void receive(String message){
    	System.out.println("【B】收到消息：【"+message+"】");
    }
    
    /**
     * 发送消息
     */
    public void send(String message){
    	System.out.println("【B】发出消息：【"+message+"】");
    }
}
