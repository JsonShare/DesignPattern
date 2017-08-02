package com.designpattern.Observer;

/**
 * 具体观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * 这里模拟 -- 具体粉丝用户对象
 * @author Json<<json1990@foxmail.com>>
 */
public class ConcreteFansObserver implements FansObserver {
	/**
	 * 文章信息
	 */
	private String article;

	@Override
	public void update(String article) {
	    this.article = article;
	    System.out.println("你关注的微信公众号发布文章了！文章标题："+article+"");
	}
}
