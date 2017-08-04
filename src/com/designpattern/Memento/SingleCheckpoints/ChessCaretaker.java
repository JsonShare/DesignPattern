package com.designpattern.Memento.SingleCheckpoints;

/**
 * 象棋备忘录管理者角色
 * @author Json<<json1990@foxmail.com>>
 */
public class ChessCaretaker {
	/**
     * 备忘录对象
     */
    private ChessMemento memento;

    public ChessMemento retrieveMemento() {
        return this.memento;
    }

    public void saveMemento(ChessMemento memento) {
     	this.memento = memento;
    }
}
