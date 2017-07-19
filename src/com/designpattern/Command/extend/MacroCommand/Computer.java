package com.designpattern.Command.extend.MacroCommand;
/**
 * 接收者角色类
 * @author Json
*/
public class Computer {
	public void startBIOS(){
		System.out.println("BIOS启动...");
	}

	public void startMBR(){
		System.out.println("MBR加载...");
	}
	
	
	public void startHDD(){
		System.out.println("HDD加载...");
	}
	
	public void startOS(){
		System.out.println("系统启动...");
	}
}
