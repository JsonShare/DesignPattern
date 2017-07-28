package com.designpattern.state.pattern_realize;

/**
 * 特定状态  -- 正常状态
 * @author Json<<json1990@foxmail.com>>
 */
public class NormalState implements State{

	@Override
	public void move(Hero hero) {
        //正常跑动则不打印内容，否则会刷屏
    }
}
