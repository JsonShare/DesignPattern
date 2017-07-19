package com.designpattern.Command.extend.Undo;
/**
 * 测试
 * @author Json
*/
public class Client {
	public static void main(String[] args) {
		String dir = "E:\\command2017";
		
		//创建接收者
		MakeDir makeDir = new MakeDir(); 
		//创建具体命令并且指定接收者
		Command create_command = new CreateDirCommand(makeDir,dir);
		//创建请求者
		RequestMakeDir request = new RequestMakeDir();
		//设置命令
		request.setCreateCommand(create_command);
		/***********创建目录及撤销**************/
		//创建目录
		request.executeCreateCommand();
		//撤销
		request.undoCreateCommand();
	}
}
