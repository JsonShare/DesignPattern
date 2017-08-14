package com.designpattern.ChainOfResponsibility;

/**
 * 客户端测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) {
		//先要组装职责链
		JiuXianQiaoSubbranch jiuxianqiao = new JiuXianQiaoSubbranch();
		WangJingSubbranch wangjing = new WangJingSubbranch();
		DongBaSubbranch dongba = new DongBaSubbranch();
		//组织责任链
		jiuxianqiao.setSuccessor(wangjing);   
		wangjing.setSuccessor(dongba);
		//张三下单 ，定一份鸡腿堡套餐
		jiuxianqiao.handleRequest(900,200);
	}
}
