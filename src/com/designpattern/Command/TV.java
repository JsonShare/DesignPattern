package com.designpattern.Command;
/**
 * 接收者角色类  -- 电视
 * @author Json
*/
public class TV {
	/**
	 * 打开方法
	 */
	public void on(){
		System.out.println("电视打开");
	}
	/**
	 * 关闭方法
	 */
	public void off(){
		System.out.println("电视关闭");
	}
}
