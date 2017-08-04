package com.designpattern.Memento.MutilCheckpoints;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) {
		ChessOriginator originator = new ChessOriginator();
		ChessCaretaker caretaker = new ChessCaretaker();
		
		originator.setPiece("马");
		originator.setLocation("原始位置");
		System.out.println("原始位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
        
		// 存储内部状态  
		caretaker.saveMemento(originator.createMemento());
		originator.setPiece("马");
		originator.setLocation("位置1");
		System.out.println("移动位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
       
		// 存储内部状态  
		caretaker.saveMemento(originator.createMemento());  
		// 改变状态  
		originator.setPiece("马");
		originator.setLocation("位置2");
		System.out.println("移动位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
		
		// 存储内部状态  
		caretaker.saveMemento(originator.createMemento());  
		// 改变状态  
		originator.setPiece("马");
		originator.setLocation("位置3");
		System.out.println("移动位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
		
		// 存储内部状态 
		caretaker.saveMemento(originator.createMemento());  
		// 改变状态 
		originator.setPiece("马");
		originator.setLocation("位置4");
		System.out.println("移动位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
		
		System.out.println("--------------------------------------");
		
		// 恢复状态
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println("毁一步棋→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
        
        //大哥我再毁一步棋
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println("再毁一步棋→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
	}
}
