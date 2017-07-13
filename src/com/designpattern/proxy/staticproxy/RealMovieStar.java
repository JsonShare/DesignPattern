package com.designpattern.proxy.staticproxy;
/**
 * 真实角色：电影明星
 * @author Json
*/
public class RealMovieStar implements MovieStar {
	@Override
	public void discussCooperation() {
		System.out.println("真实角色：discussCooperation()");
	}

	@Override
	public void signContract() {
		System.out.println("真实角色：signContract()");
	}

	@Override
	public void playRoleInMovie() {
		System.out.println("真实角色：playRoleInMovie()");
	}

	@Override
	public void collectMoney() {
		System.out.println("真实角色：collectMoney()");
	}
}
