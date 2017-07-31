package com.designpattern.Mediator;

/**
 * 抽象中介者类
 * @author Json<<json1990@foxmail.com>>
 */
public interface Mediator {
    /**
     * 发送消息
     */
	public void chat(People p,String message);
}
