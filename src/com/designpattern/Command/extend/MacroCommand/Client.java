package com.designpattern.Command.extend.MacroCommand;

/**
 * 测试
 * @author Json
*/
public class Client {
	public static void main(String[] args) {
		//创建接收者
		Computer computer = new Computer();
        //创建命令对象，设定它的接收者
        Command bios_command = new BIOSStartCommand(computer);
        //创建命令对象，设定它的接收者
        Command mbr_command = new MBRStartCommand(computer);
        //创建命令对象，设定它的接收者
        Command hdd_command = new HDDStartCommand(computer);
        //创建命令对象，设定它的接收者
        Command os_command = new OSStartCommand(computer);
        //命令控制对象Invoker，把命令对象通过构造方法设置进去
        MacroCommand invoker = new ComputerMacroCommand();
        invoker.addCommand(bios_command);
        invoker.addCommand(mbr_command);
        invoker.addCommand(hdd_command);
        invoker.addCommand(os_command);

        System.out.println("我要是用电脑，于是按下开机按钮...");
        
        invoker.execute();
        
        System.out.println("现在可以使用电脑了！！！");
	}
}
