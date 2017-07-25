package com.designpattern.bridge.solution_2;
/**
 * 测试
 * @author Json
*/
public class Client {
	public static void main(String[] args) {
		  //创建具体的实现对象  
	      MessageImplementor impl = new EmailMessage();  
	      //创建一个普通消息对象  
	      AbstractMessage m = new CommonMessage(impl);  
	      m.sendMessage("本月需完成任务如下：...", "Json_Wang");         
	      //创建一个加急消息对象  
	      m = new UrgencyMessage(impl);  
	      m.sendMessage("本周需完成任务如下：...", "Json_Wang");         
	      //创建一个特急消息对象  
	      m = new VeryUrgencyMessage(impl);  
	      m.sendMessage("尽快修复致命bug,今天客户端无法登陆的问题！", "Json_Wang");  

	      System.out.println("--------------------------------------");
	      
	      //把实现方式切换成手机短消息，然后再实现一遍  
	      impl = new MobileMessage();  
	      m = new CommonMessage(impl);  
	      m.sendMessage("本月需完成任务如下：...", "Json_Wang");      
	      m = new UrgencyMessage(impl);  
	      m.sendMessage("本周需完成任务如下：...", "Json_Wang");     
	      m = new VeryUrgencyMessage(impl);  
	      m.sendMessage("尽快修复致命bug,今天客户端无法登陆的问题！", "Json_Wang");  
	      
	      //站内消息实现省略...
	}
}
