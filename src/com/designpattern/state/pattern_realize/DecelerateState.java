package com.designpattern.state.pattern_realize;

/**
 * 特定状态 -- 减速状态
 * @author Json<<json1990@foxmail.com>>
 */
public class DecelerateState implements State {

	@Override
	public void move(Hero hero) {
        System.out.println("减速状态，英雄減速移动");
        //假设减速持续2.5秒
        try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        hero.setState(hero.NORMAL_STATE);
        System.out.println("减速状态结束，恢复正常状态");
	}
}
