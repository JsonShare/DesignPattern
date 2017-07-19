package com.designpattern.Command.extend.CommandQueue;
/**
 * 接收者角色类 - H5工程师
 * @author Json
*/
public class H5Coder {
	/**
     * 真正执行命令相应的操作
     */
    public void work(String task){
        System.out.println("H5工程师要完成【"+task+"】");
    }
}
