package com.designpattern.Memento.undoByMemento;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) {
		//创建接收者
		ChessOriginator originator = new ChessOriginator();
		ChessCaretaker caretaker = new ChessCaretaker();
		//创建命令对象，设定它的接收者
        Command command = new TakeBackCommand(originator,caretaker);
        //创建请求者
        People people = new People(command);
		
        
        originator.setPiece("马");
		originator.setLocation("原始位置");
		System.out.println("原始位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
        
		people.executeCreateCommand();
		originator.setPiece("马");
		originator.setLocation("位置1");
		System.out.println("移动位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
       
		people.executeCreateCommand();
		// 改变状态  
		originator.setPiece("马");
		originator.setLocation("位置2");
		System.out.println("移动位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
		
		people.executeCreateCommand(); 
		// 改变状态  
		originator.setPiece("马");
		originator.setLocation("位置3");
		System.out.println("移动位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
		
		people.executeCreateCommand();
		// 改变状态 
		originator.setPiece("马");
		originator.setLocation("位置4");
		System.out.println("移动位置→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
		
		System.out.println("--------------------------------------");
		
		people.undoCreateCommand();
        System.out.println("毁一步棋→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
        
        //大哥我再毁一步棋
        people.undoCreateCommand();
        System.out.println("再毁一步棋→ "+"棋子："+originator.getPiece()+"||位置："+originator.getLocation());
	}
}
