package com.designpattern.Command.extend.RequestLog;

import java.io.Serializable;
/**
 * 请求接收者 -- 由于Operator类的对象是Command的成员对象，它也将随Command对象一起写入文件，因此Operator也需要实现Serializable接口  
 * @author Json
*/
public class Operator implements Serializable{
	private static final long serialVersionUID = 1L;

	public void insert(String args) {  
        System.out.println("新增数据：" + args);  
    }  
      
    public void update(String args) {  
        System.out.println("修改数据：" + args);  
    }  
      
    public void delete(String args) {  
        System.out.println("删除数据：" + args);  
    }  
}
