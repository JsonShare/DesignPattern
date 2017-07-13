package com.designpattern.proxy.dynamicproxy;

import java.lang.reflect.Proxy;
/**
 * 测试
 * @author Json
*/
public class Test {
	public static void main(String[] args) {
		MovieStar star = new RealMovieStar();
		//处理器
		ProxyMovieStarHandler handler = new ProxyMovieStarHandler(star);
		//代理类
		MovieStar proxyMovieStar = (MovieStar) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{MovieStar.class}, handler);
		//调用代理类的playRoleInMovie，实际调用的是真实角色的playRoleInMovie
		proxyMovieStar.playRoleInMovie();
	}
}
