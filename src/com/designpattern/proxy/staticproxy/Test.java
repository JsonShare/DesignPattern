package com.designpattern.proxy.staticproxy;
/**
 * 测试
 * @author Json
*/
public class Test {
	public static void main(String[] args) {
		RealMovieStar real = new RealMovieStar();
		MovieStar proxy = new ProxyMovieStar(real);
	    proxy.discussCooperation();
	    proxy.signContract();
	    proxy.playRoleInMovie();//需要真实对象实现操作（出演电影）
	    proxy.collectMoney();
	}
}
