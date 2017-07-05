package com.designpattern.templete;
/**
* 类说明 ：学校教师作业
*/
public abstract class Homeork {
	
	final void workflow(){
		//老师布置作业
		this.assginHomework();
		//学生 做 作业
		this.doHomework();
		//老师检查作业
		this.checkHomework();
	}
	
	
	//布置作业
	void assginHomework(){
		System.out.println("回家做课后习题，明天检查！");
	}
	
	//学生 做 作业
	abstract void doHomework();
	
	//检查作业
	void checkHomework(){
		System.out.println("检查作业！");
	}
}
