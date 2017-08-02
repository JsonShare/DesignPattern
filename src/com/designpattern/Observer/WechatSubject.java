package com.designpattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册和删除观察者的接口
 * 这里模拟 -- 微信公众号
 * @author Json<<json1990@foxmail.com>>
 */
public class WechatSubject {
	/**
	 * 用来保存注册的观察者对象
	 */
	private List<FansObserver> observers = new ArrayList<FansObserver>();
	/**
	 * 注册观察者对象
	 * @param observer 观察者对象
	 */
	public void attach(FansObserver observer) {
	   observers.add(observer);
	}
	/**
	 * 删除观察者对象
	 * @param observer 观察者对象
	 */
	public void detach(FansObserver observer) {
	   observers.remove(observer);
	}
	/**
	 * 通知所有注册的观察者对象
	 */
	protected void notify(String article) {
	   for(FansObserver observer : observers){
	       observer.update(article);
	   }
	}
}
