package com.designpattern.templete;
/**
* 类说明 ：学校教师作业
*/
public abstract class Homeork {
	//布置作业
	public void assginHomework(){
		System.out.println("回家做课后习题，明天检查！");
	}
	
	//学生 做 作业
	public abstract void doHomework();
	
	//检查作业
	public void checkHomework(){
		System.out.println("检查作业！");
	}
}
