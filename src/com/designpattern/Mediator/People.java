package com.designpattern.Mediator;

/**
 * 抽象同事类  -- 聊天人员
 * @author Json<<json1990@foxmail.com>>
 */
public abstract class People { 
	//人员昵称
	private String name;
    //持有一个中介者对象
    private Mediator mediator;
    
    /**
     * 构造函数
     */
    public People(Mediator mediator,String name){
        this.mediator = mediator;
        this.name = name;
    }
    /**
     * 获取中介者对象
     */
    public Mediator getMediator() {
        return mediator;
    }
    /**
     * 获取昵称
     */
    public String getName() {
        return name;
    }
    
    /**
     * 接收消息
     */
    public abstract void receive(String message);
    
    /**
     * 发送消息
     */
    public abstract void send(String message);
}
