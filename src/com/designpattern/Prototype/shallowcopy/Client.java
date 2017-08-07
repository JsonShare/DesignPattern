package com.designpattern.Prototype.shallowcopy;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.utils.DateFormatUtil;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) {
		List<String> executors = new ArrayList<String>();
		executors.add("张三");
		executors.add("李四");
		
		Plan plan = new Plan();
		plan.setName("重构前端登录界面");
		plan.setLevel(1);
		plan.setStartdate(DateFormatUtil.stringToDate(DateFormatUtil.YYYYMMDD,"2017-08-07"));
		plan.setEnddate(DateFormatUtil.stringToDate(DateFormatUtil.YYYYMMDD,"2017-08-09"));
		plan.setExecutors(executors);
		
		Plan plan2 = plan.clone();
		plan2.setName("后端接口改造");
		plan2.setLevel(2);
		plan2.setStartdate(DateFormatUtil.stringToDate(DateFormatUtil.YYYYMMDD,"2017-08-10"));
		plan2.setEnddate(DateFormatUtil.stringToDate(DateFormatUtil.YYYYMMDD,"2017-08-12"));
		
		System.out.println("地址是否一样？"+(plan == plan2));
		System.out.println("plan.getName() == plan2.getName() "+(plan.getName() == plan2.getName()));
		System.out.println("plan.getLevel() == plan2.getLevel() "+(plan.getLevel() == plan2.getLevel()));
		System.out.println("plan.getStartdate() == plan2.getStartdate() "+(plan.getStartdate() == plan2.getStartdate()));
		System.out.println("plan.getEnddate() == plan2.getEnddate() "+(plan.getEnddate() == plan2.getEnddate()));
		System.out.println("plan.getExecutors() == plan2.getExecutors() "+(plan.getExecutors() == plan2.getExecutors()));
		System.out.println("plan:"+plan.toString());
		System.out.println("plan2:"+plan2.toString());
		
		//plan任务比较重，在给plan添加一个人
		executors.add("王五");
		plan.setExecutors(executors);
		
		System.out.println();
		System.out.println("地址是否一样？"+(plan == plan2));
		System.out.println("plan.getName() == plan2.getName() "+(plan.getName() == plan2.getName()));
		System.out.println("plan.getLevel() == plan2.getLevel() "+(plan.getLevel() == plan2.getLevel()));
		System.out.println("plan.getStartdate() == plan2.getStartdate() "+(plan.getStartdate() == plan2.getStartdate()));
		System.out.println("plan.getEnddate() == plan2.getEnddate() "+(plan.getEnddate() == plan2.getEnddate()));
		System.out.println("plan.getExecutors() == plan2.getExecutors() "+(plan.getExecutors() == plan2.getExecutors()));
		System.out.println("plan:"+plan.toString());
		System.out.println("plan2:"+plan2.toString());
	}
}
