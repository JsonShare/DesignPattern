package com.designpattern.iterator.jdk_use_iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/**
 * 测试JDK自带的迭代器
 * @author Json
*/
public class IteratorTest {
	public static void main(String[] args) {
	      List list = new ArrayList();  
	      for(int i = 0;i < 10;i++){  
	          list.add("list_"+i);  
	      }  
	      Iterator iterList = list.iterator();//List接口实现了Iterable接口  
	      while(iterList.hasNext()){  
	          String str = (String)iterList.next();  
	          System.out.print(str+"、");  
	      }  
	
	      System.out.println("");
	      
	      Map map = new HashMap();  
	      for(int i = 0;i < 10;i++){  
	          map.put(i,"map_"+i);  
	      }  
	      Iterator iterMap = map.entrySet().iterator();
	      while(iterMap.hasNext()){  
	          Map.Entry strMap = (Map.Entry)iterMap.next();  
	          System.out.print(strMap.getValue()+"、");  
	      } 
   }  
}
