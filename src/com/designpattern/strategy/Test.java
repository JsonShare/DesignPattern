package com.designpattern.strategy;
/**
* 类说明 ：测试
*/
public class Test {
	public static void main(String[] args) {
		//618活动
		ActivityEntry activity = new ActivityEntry();
		activity.activityEntry("618");
		
		//1111活动
		ActivityEntry activity1 = new ActivityEntry();
		activity1.activityEntry("1111");
		
		//1212活动
		ActivityEntry activity2 = new ActivityEntry();
		activity2.activityEntry("1212");
	}
}
