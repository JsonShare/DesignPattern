package com.designpattern.Composite;

/**
 * 叶子
 * @author Json<<json1990@foxmail.com>>
 */
public class Leaf extends Component {
	/**
	 * 叶子对象的名字
	 */
	private String name = "";
	
	/**
	 * 构造方法，传入叶子对象的名字
	 * @param name 叶子对象的名字
	 */
	public Leaf(String name){
	   this.name = name;
	}
	
	/**
	 * 输出叶子对象的结构，叶子对象没有子对象，也就是输出叶子对象的名字
	 * @param str 前缀，主要是按照层级拼接的空格，实现向后缩进
	 */
	public void outputSelf(String str) {
	   System.out.println(str+"- "+name);
	}
}
