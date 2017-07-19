package com.designpattern.Command.extend.MultiUndo;

import java.util.ArrayList;

/**
 * 具体命令 -- 创建目录
 * @author Json
*/
public class CreateDirCommand implements Command {
	private ArrayList<String> dirNameList; //记录 这里用list实现
    private MakeDir makeDir;
    public CreateDirCommand(MakeDir makeDir) {
    	dirNameList = new ArrayList<String>();
    	this.makeDir = makeDir;
    }
    
    @Override
	public void execute(String dirName) {
		makeDir.createDir(dirName);
		dirNameList.add(dirName);
	}
    
    @Override
	public void undo() {
    	if(dirNameList.size()>0){
			makeDir.deleteDir(dirNameList.get(dirNameList.size()-1));
	        dirNameList.remove(dirNameList.size()-1);
	    }else{
	         System.out.println("没有需要撤销的操作！");
	    }
	}
}
