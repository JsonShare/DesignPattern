package com.designpattern.Observer;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) {
		//创建微信公众号主题
		ConcreteWechatSubject sub = new ConcreteWechatSubject();
        //创建粉丝观察者
		FansObserver obsever = new ConcreteFansObserver();
		FansObserver obsever1 = new ConcreteFansObserver();
        //添加观察者
        sub.attach(obsever);
        sub.attach(obsever1);
        //微信公众号发布文章
        sub.setArticle("《关于建军90周年》");
	}
}
