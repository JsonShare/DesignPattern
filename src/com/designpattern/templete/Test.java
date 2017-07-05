package com.designpattern.templete;
/**
* 类说明 ：测试
*/
public class Test {

	public static void main(String[] args) {
		//测试一次完成作业： 同学都是怎么样完成作业的
		StudentA A = new StudentA();
		A.doHomework();
		
		StudentB B = new StudentB();
		B.doHomework();
	}

}
