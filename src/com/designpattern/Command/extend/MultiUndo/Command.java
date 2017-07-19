package com.designpattern.Command.extend.MultiUndo;
/**
 * 包含撤销命令的接口
 * @author Json
*/
public interface Command {
	//执行方法
    void execute(String dirName);
    //撤销方法
    void undo();
}
