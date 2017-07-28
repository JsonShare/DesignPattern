package com.designpattern.state.pattern_realize;

/**
 * 封装与Context的一个特定状态相关的行为：英雄移动
 * @author Json<<json1990@foxmail.com>>
 */
public interface State {
	
	/**
	 * 处理移动状态
	 * @param hero
	 */
	public void move(Hero hero);
}
