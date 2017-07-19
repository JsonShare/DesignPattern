package com.designpattern.Command.extend.RequestLog;
/**
 * 测试
 * @author Json
*/
public class Client {
	public static void main(String[] args) {
		SqlExecuteTool tool = new SqlExecuteTool(); //定义请求发送者  
		Operator operator = new Operator(); //定义请求接收者  
		  
		Command command;
		
		//执行了很多次SQL
		command = new InsertCommand("增加");  
		command.setOperator(operator);   
		tool.setCommand(command);  
		tool.call("insert xxx");  
		  
		command = new InsertCommand("增加");  
		command.setOperator(operator);  
		tool.setCommand(command);  
		tool.call("insert xxx");  
		  
		command = new UpdateCommand("修改"); 
		command.setOperator(operator); 
		tool.setCommand(command);  
		tool.call("update xxx");  
		  
		command = new DeleteCommand("删除");
		command.setOperator(operator);  
		tool.setCommand(command);          
		tool.call("delete xxx");  
		  
		System.out.println("-------------------------------------");
		System.out.println("保存执行的sql");  
		tool.save();
		System.out.println("-------------------------------------");
		System.out.println("恢复执行的sql");  
		System.out.println("-------------------------------------");
		tool.recover(); 
	}
}
