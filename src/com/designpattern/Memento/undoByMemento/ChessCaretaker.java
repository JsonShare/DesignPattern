package com.designpattern.Memento.undoByMemento;

import java.util.Stack;

/**
 * 象棋备忘录管理者角色
 * @author Json<<json1990@foxmail.com>>
 */
public class ChessCaretaker {
	private Stack<ChessMemento> stack; 
	
    public ChessCaretaker() { 
    	stack = new Stack<ChessMemento>();
    }

    /**
	 * 存储备忘录对象
	 */
	public void saveMemento(ChessMemento m) {
		stack.push(m);
	}
	
    /**
     * 获取备忘录对象
     * @return
     */
	public ChessMemento retrieveMemento() {
		if(stack.isEmpty()){
			System.out.println("不能再悔棋了！");
			return null;
		}
		return stack.pop(); //移除元素
	}
}
