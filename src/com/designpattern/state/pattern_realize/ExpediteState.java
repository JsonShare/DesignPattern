package com.designpattern.state.pattern_realize;

/**
 * 特定状态 -- 加速状态
 * @author Json<<json1990@foxmail.com>>
 */
public class ExpediteState implements State {

	@Override
	public void move(Hero hero) {
		System.out.println("加速状态，英雄加速移动");
        //假设加速持续5秒
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        hero.setState(hero.NORMAL_STATE);
        System.out.println("加速状态结束，恢复正常状态");
	}
}
