package com.designpattern.Composite;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) {
		//定义所有的组合对象
		Composite root = new Composite("吊炸天股份有限公司");
		Composite c1 = new Composite("北京分公司");
		Composite c2 = new Composite("上海分公司");
		//定义所有的叶子对象
		Leaf leaf1_1 = new Leaf("研发部");
		Leaf leaf1_2 = new Leaf("市场部");
		Leaf leaf1_3 = new Leaf("省略...");
		
		Leaf leaf2_1 = new Leaf("市场部");
		Leaf leaf2_2 = new Leaf("销售部");
		Leaf leaf2_3 = new Leaf("省略...");

		//按照树的结构来组合组合对象和叶子对象
		root.add(c1);
		c1.add(leaf1_1);
		c1.add(leaf1_2);     
		c1.add(leaf1_3);     
		
		root.add(c2);      
		c2.add(leaf2_1);
		c2.add(leaf2_2);
		c2.add(leaf2_3);

		//调用根对象的输出功能来输出整棵树
		root.outputSelf("");
		
		System.out.println("--------删除节点（上海分公司撤销了）↓↓↓----------");
		root.remove(c2);
		root.outputSelf("");
	}
}
