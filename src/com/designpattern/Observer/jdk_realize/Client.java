package com.designpattern.Observer.jdk_realize;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) {
		//创建微信公众号主题
		ConcreteWechatSubject sub = new ConcreteWechatSubject();
		//创建粉丝观察者
		ConcreteFansObserver obsever = new ConcreteFansObserver();
		ConcreteFansObserver obsever1 = new ConcreteFansObserver();
		//添加观察者
		sub.addObserver(obsever);
		sub.addObserver(obsever1);
		//微信公众号发布文章
		sub.setArticle("《关于建军90周年》");
	}
}
