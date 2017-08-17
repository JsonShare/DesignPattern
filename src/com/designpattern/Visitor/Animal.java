package com.designpattern.Visitor;

/**
 * 抽象节点（元素）角色 -- 宠物
 * @author Json<<json1990@foxmail.com>>
 */
public abstract class Animal {
	//吃食操作
    public abstract void accept(Person person);
}
