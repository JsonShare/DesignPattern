package com.designpattern.Command.extend.MultiUndo;
/**
 * 测试
 * @author Json
*/
public class Client {
	public static void main(String[] args) {
		//创建接收者
		MakeDir makeDir = new MakeDir(); 
		//创建具体命令并且指定接收者
		Command create_command = new CreateDirCommand(makeDir);
		//创建请求者
		RequestMakeDir request = new RequestMakeDir();
		//设置命令
		request.setCreateCommand(create_command);
		/***********创建目录及撤销**************/
		//创建目录
		request.executeCreateCommand("E:\\command\\2017");
		request.executeCreateCommand("E:\\command\\2018");
		request.executeCreateCommand("E:\\command\\2019");
		request.executeCreateCommand("E:\\command\\2020");
		System.out.println("----------------------撤销--------------------");
		//多次撤销
		request.undoCreateCommand();
		request.undoCreateCommand();
		request.undoCreateCommand();
		request.undoCreateCommand();
		request.undoCreateCommand();
	}
}
