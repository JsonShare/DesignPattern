package com.designpattern.Command.extend.CommandQueue;
/**
 * 
 * @author Json
*/
public class Client {
	public static void main(String[] args) {
		//创建接收者
		JavaCoder javaCoder = new JavaCoder();
		H5Coder h5Coder = new H5Coder();
		 //创建命令对象
		JavaCommand javaCommand = new JavaCommand(javaCoder,"登录模块的后台代码");
		H5Command h5Command = new H5Command(h5Coder,"登录模块的前台代码");
        //创建命令对象队列
		CommandQueue commandqueue = new CommandQueue();
		commandqueue.addCommand(javaCommand);
		commandqueue.addCommand(h5Command);
        //创建请求者，把命令对象设置进去
		Manager manager = new Manager(commandqueue);
        //执行方法
		manager.call();
	}
}
