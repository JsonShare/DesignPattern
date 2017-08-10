package com.designpattern.Flyweight.composite;

/**
 * 享元接口
 * @author Json<<json1990@foxmail.com>>
 */
public interface Flyweight {
	/**
	 * 传入外部状态
	 * @param extrinsicState 外部状态
	 */
	public void operation(String extrinsicState);
}
