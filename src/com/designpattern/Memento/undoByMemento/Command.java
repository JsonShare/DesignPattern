package com.designpattern.Memento.undoByMemento;

/**
 * 包含撤销命令的接口
 * @author Json<<json1990@foxmail.com>>
*/
public interface Command {
	//下棋操作
    void execute();
    //撤销方法
    void undo();
}
