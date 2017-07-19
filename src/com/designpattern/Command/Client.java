package com.designpattern.Command;
/**
 * 客户端角色类
 * @author Json
*/
public class Client {
	public static void main(String[] args) {
		//创建接收者
        TV receiver = new TV();
        //创建命令对象，设定它的接收者
        Command on_command = new TVOnCommand(receiver);
        //创建命令对象，设定它的接收者
        Command off_command = new TVOffCommand(receiver);
        //命令控制对象Invoker，把命令对象通过构造方法设置进去
        RemoteControl invoker = new RemoteControl(on_command,off_command);
        //执行方法  -- 打开电视
        invoker.turnOn();
        //执行方法 -- 关闭电视
        invoker.turnOff();
	}
}
