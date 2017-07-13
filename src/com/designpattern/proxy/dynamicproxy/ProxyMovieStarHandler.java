package com.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理角色的处理器
 * @author Json
*/
public class ProxyMovieStarHandler implements InvocationHandler {

	private MovieStar moviestar;
	public ProxyMovieStarHandler(MovieStar moviestar){
		super();
        this.moviestar = moviestar;
	}
	
	/**
     * 所有的流程控制都在invoke方法中
     * proxy：代理类
     * method：正在调用的方法
     * args：方法的参数
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
        System.out.println("调用之前的处理逻辑");
        if (method.getName().equals("playRoleInMovie")) {
            object = method.invoke(moviestar, args);//激活调用的方法   
        }
        System.out.println("调用之后的处理逻辑");
        return object;
	}
}
