package com.designpattern.proxy.dynamicproxy;
/**
 * 定义一个抽象角色：电影明星
 * @author Json
*/
public interface MovieStar {
	/**
	 * 找电影合作
	 */
	void discussCooperation();
	/**
	 * 签合同
	 */
	void signContract();
	/**
	 * 出演电影角色
	 */
	void playRoleInMovie();
	/**
	 * 收演出费
	 */
	void collectMoney();
}
