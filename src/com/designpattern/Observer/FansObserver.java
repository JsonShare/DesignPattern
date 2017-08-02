package com.designpattern.Observer;

/**
 * 观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * 这里模拟 -- 粉丝用户接口
 * @author Json<<json1990@foxmail.com>>
 */
public interface FansObserver {
	/**
	 * 粉丝接收文章接口
	 */
	public void update(String article);
}
