package com.designpattern.Memento.OfflineStorage;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) {
		ChessOriginator originator = new ChessOriginator();
		ChessCaretaker caretaker = new ChessCaretaker();
		
		originator.setPiece("马");
		originator.setLocation("位置1");
		System.out.println("移动位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
        // 存储内部状态  
		caretaker.saveMemento(originator.createMemento());  
        
		// 改变状态  
		originator.setPiece("马");
		originator.setLocation("位置2");
		System.out.println("移动位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
		
		// 恢复状态  
        originator.restoreMemento(caretaker.retrieveMemento());  
        System.out.println("我要悔棋（棋子回到上一个状态）→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
	}

}
