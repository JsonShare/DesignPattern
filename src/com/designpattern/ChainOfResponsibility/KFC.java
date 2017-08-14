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
	 * 处理接单
	 * @param _x  横坐标，用于判断距离
	 * @param _y  纵坐标，用于判断距离
	 */
	public abstract void handleRequest(int _x,int _y);
}
