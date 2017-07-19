package com.designpattern.Command.extend.MultiUndo;

import java.io.File;

/**
 * 命令接受者
 * 包含两个命令：创建目录、删除目录
 * @author Json
*/
public class MakeDir {
	//创建目录
	public void createDir(String name){
		File dir = new File(name);
		if (dir.exists()) {  
            System.out.println("创建目录 " + name + " 失败，目标目录已经存在");  
        }else{
        	//创建目录  
            if (dir.mkdirs()) {
                System.out.println("创建目录 " + name + " 成功");  
            } else {  
                System.out.println("创建目录 " + name + " 失败");  
            }  
        } 
	}
	//删除目录
	public void deleteDir(String name){
		File dir = new File(name);
		if(dir.exists()) {  
            if(dir.delete()){
            	System.out.println("删除目录 " + name + " 成功");
            }else{
            	System.out.println("删除目录 " + name + " 失败");
            }
        }else{
        	System.out.println("删除目录 " + name + " 失败，目标目录不存在");
        }
	}
}
