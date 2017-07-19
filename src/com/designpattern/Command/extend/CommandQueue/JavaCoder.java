package com.designpattern.Command.extend.CommandQueue;
/**
 * 接收者角色类 - Java工程师
 * @author Json
*/
public class JavaCoder {
	 /**
     * 真正执行命令相应的操作
     */
    public void work(String task){
        System.out.println("java工程师要完成【"+task+"】");
    }
}
