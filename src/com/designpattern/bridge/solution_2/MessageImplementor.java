package com.designpattern.bridge.solution_2;
/**
 * 实现发送消息的统一接口 
 * @author Json
*/ 
public interface MessageImplementor {  
   /** 
    * 发送消息 
    * @param message 消息内容 
    * @param toUser 接收人 
    */  
	public void send(String message,String users);  
}
