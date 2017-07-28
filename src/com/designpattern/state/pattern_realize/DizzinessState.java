package com.designpattern.state.pattern_realize;

/**
 * 特定状态 -- 眩晕状态
 * @author Json<<json1990@foxmail.com>>
 */
public class DizzinessState implements State {

	@Override
	public void move(Hero hero) {
		System.out.println("眩晕状态，英雄停止移动");
        //假设眩晕持续1.5秒
        try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        hero.setState(hero.NORMAL_STATE);
        System.out.println("眩晕状态结束，恢复正常状态");
	}
}
