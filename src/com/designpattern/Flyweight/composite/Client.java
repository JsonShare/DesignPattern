package com.designpattern.Flyweight.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) {
		List<String> compositeState = new ArrayList<String>();
		compositeState.add(Menu.水煮肉片);
		compositeState.add(Menu.酸辣土豆丝);
		compositeState.add(Menu.米饭);
        FlyweightFactory flyFactory = new FlyweightFactory();
        Flyweight compositeFly1 = flyFactory.factory(compositeState);
        compositeFly1.operation("张三点菜"); 
        
        System.out.println();
        
        List<String> compositeState2 = new ArrayList<String>();
		compositeState2.add(Menu.鱼香茄条);
		compositeState2.add(Menu.鱼香肉丝);
		compositeState2.add(Menu.米饭);
        Flyweight compositeFly2 = flyFactory.factory(compositeState2);
        compositeFly2.operation("李四点菜");
        
        System.out.println();
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));
        
        System.out.println(flyFactory.getFlyWeightSize());
       
	}
}
