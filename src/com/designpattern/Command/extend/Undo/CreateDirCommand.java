package com.designpattern.Command.extend.Undo;

/**
 * 具体命令 -- 创建目录
 * @author Json
*/
public class CreateDirCommand implements Command {
	private String dirName;
    MakeDir makeDir;
    public CreateDirCommand(MakeDir makeDir,String dirName) {
    	this.makeDir = makeDir;
    	this.dirName = dirName;
    }
    
    @Override
	public void execute() {
		makeDir.createDir(dirName);
	}
    
    @Override
	public void undo() {
    	makeDir.deleteDir(dirName);
	}
}
