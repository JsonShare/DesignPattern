package com.designpattern.bridge.solution_1;

/**
 * 测试 
 * @author Json
*/
public class Client {
	
	public static void main(String[] args) {
		Message s;
		
		//创建普通消息
		s = new CommonEmailMessage();
		s.send("本月需完成任务如下：...", "Json_Wang"); 
		//创建一个加急消息对象 
		s = new UrgencyEmailMessage();
		s.send("本周需完成任务如下：...", "Json_Wang"); 
	    //创建一个特急消息对象  
	    s = new VeryUrgencyEmailMessage();  
	    s.send("尽快修复致命bug,今天客户端无法登陆的问题！", "Json_Wang");
	    
	    System.out.println("---------------------------------");
	    
	    //创建普通消息
  		s = new CommonMobileMessage();
  		s.send("本月需完成任务如下：...", "Json_Wang"); 
  		//创建一个加急消息对象 
  		s = new UrgencyMobileMessage();
  		s.send("本周需完成任务如下：...", "Json_Wang"); 
  	    //创建一个特急消息对象  
  	    s = new VeryUrgencyMobileMessage();  
  	    s.send("尽快修复致命bug,今天客户端无法登陆的问题！", "Json_Wang");
  	    
  	    //站内消息实现省略...
	} 
}
