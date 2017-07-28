package com.designpattern.state.common_realize;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero();
        hero.startMove();
        System.out.println("队友给了一个加速技能↓↓↓");
        hero.setState(Hero.EXPEDITE_STATE);
        Thread.sleep(10000);//在过10秒，被对方英雄虚弱
        System.out.println("被对方英雄虚弱了↓↓↓");
        hero.setState(Hero.DECELERATE_STATE);
        Thread.sleep(10000);//在过10秒，被对方英雄眩晕
        System.out.println("被对方英雄眩晕了↓↓↓");
        hero.setState(Hero.DIZZINESS_STATE);
        Thread.sleep(10000);//在过10秒，游戏结束
        hero.stopMove();
	}
}
