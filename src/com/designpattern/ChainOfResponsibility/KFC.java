package com.designpattern.ChainOfResponsibility;

/**
 * 抽象职责类 -- 肯德基
 * @author Json<<json1990@foxmail.com>>
 */
public abstract class KFC {
	
	/**
	* 持有后继的职责对象
	*/
	protected KFC successor;
	
	/**
	* 设置后继的职责对象
	* @param successor 后继的职责对象
	*/
	public void setSuccessor(KFC successor) {
		this.successor = successor;
	}
	
	/**
	* 示意处理请求的方法，虽然这个示意方法是没有传入参数，
	* 但实际是可以传入参数的，根据具体需要来选择是否传递参数
	*/
	public abstract void handleRequest(int _x,int _y);
}
