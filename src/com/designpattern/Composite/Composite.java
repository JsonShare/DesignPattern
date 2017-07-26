package com.designpattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件
 * @author Json<<json1990@foxmail.com>>
 */
public class Composite extends Component {
	/**
	 * 用来存储组合对象中包含的子组件对象
	 */
	private List<Component> childComponents = null;
	
	/**
	 * 组合对象的名字
	 */
	private String name = "";
	
	/**
	 * 构造方法，传入组合对象的名字
	 * @param name 组合对象的名字
	 */
	public Composite(String name){
	   this.name = name;
	}

	/**
	* 向组合对象中加入组件对象
	* @param child 被加入组合对象中的组件对象
	*/
	public void add(Component child) {
	   //延迟初始化
	   if (childComponents == null) {
	       childComponents = new ArrayList<Component>();
	   }
	   childComponents.add(child);
	}
	
	/**
	* 从组合对象中移出某个组件对象
	* @param child 被移出的组件对象
	*/
	public void remove(Component child) {
	    if (childComponents != null) {
            childComponents.remove(child);
	     }     
	}
	
	/**
	 * 输出组合对象自身的结构
	 * @param str 前缀，主要是按照层级拼接的空格，实现向后缩进
	 */
	@Override
	public void outputSelf(String str) {
	   //先把自己输出去
	   System.out.println(str+"+ "+this.name);
	   //如果还包含有子组件，那么就输出这些子组件对象
	   if(this.childComponents != null){
	       //添加若干空格，表示向后缩进若干空格
	       str+="    ";     
	       //输出当前对象的子对象了
	       for(Component c : childComponents){
	          //递归输出每个子对象
	          c.outputSelf(str);
	       }
	   }
	}
}
