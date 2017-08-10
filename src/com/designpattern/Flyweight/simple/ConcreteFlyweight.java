package com.designpattern.Flyweight.simple;

/**
 * 具体的享元对象
 * @author Json<<json1990@foxmail.com>>
 */
public class ConcreteFlyweight implements Flyweight{
	/**
	 * 描述内部状态
	 */
	private String intrinsicState;
	
	/**
	 * 构造方法，传入享元对象的内部状态的数据
	 * @param state 享元对象的内部状态的数据
	 */
	public ConcreteFlyweight(String state){
		this.intrinsicState = state;
	}

	@Override
	public void operation(String extrinsicState) {
		//具体的功能处理，可能会用到享元内部、外部的状态
		System.out.println("内蕴状态："+this.intrinsicState+"，外蕴状态："+extrinsicState+"");
	} 
}
