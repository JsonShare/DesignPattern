package com.designpattern.iterator.jdk_use_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 * 
 * @author Json
*/
public class IteratorTest1 {

	public static void main(String[] args) {
		Collection<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        
        //removeItem1(list);
        //removeItem2(list);
        removeItem3(list);
    }
	
	/**
	 * 错误用法1
	 */
	public static void removeItem1(Collection<String> list){
        Iterator<String> iterator_1 = list.iterator();
        while (iterator_1.hasNext()) {
     		String str = iterator_1.next();
     		if("张三".equals(str)){
     			list.remove(str);
     		}
        }
        System.out.println(list);
	}
	
	/**
	 * 错误用法2
	 */
	public static void removeItem2(Collection<String> list){
        for (String str : list) {
        	if("张三".equals(str)){
        		list.remove(str);
        	}
        }
        System.out.println(list);
	}
	
	/**
	 * 正确用法
	 */
	public static void removeItem3(Collection<String> list){
        Iterator<String> iterator_3 = list.iterator();
        while (iterator_3.hasNext()) {
     		String str = iterator_3.next();
     		if("张三".equals(str)){
     			iterator_3.remove();
     		}
        }
        System.out.println(list);
	}
}
