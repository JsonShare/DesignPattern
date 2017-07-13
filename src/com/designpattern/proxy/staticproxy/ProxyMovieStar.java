package com.designpattern.proxy.staticproxy;
/**
 * 代理角色：经纪人
 * @author Json
*/
public class ProxyMovieStar implements MovieStar {
	/**
	 * 真实对象的引用
	 */
	private MovieStar star;
	public ProxyMovieStar(MovieStar star){
		this.star = star;
	}
	
	@Override
	public void discussCooperation() {
		System.out.println("代理角色：discussCooperation()");
	}

	@Override
	public void signContract() {
		System.out.println("代理角色：signContract()");
	}

	@Override
	public void playRoleInMovie() {
		star.playRoleInMovie();   //这个需要真实角色实现的操作
	}

	@Override
	public void collectMoney() {
		System.out.println("代理角色：collectMoney()");
	}
}
