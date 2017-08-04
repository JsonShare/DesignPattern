package com.designpattern.Memento.undoByMemento;

/**
 * 具体命令 -- 悔棋命令
 * @author Json<<json1990@foxmail.com>>
*/
public class TakeBackCommand implements Command {
	private ChessCaretaker caretaker;
	private ChessOriginator originator;
   
	public TakeBackCommand(ChessOriginator originator,ChessCaretaker caretaker) {
    	this.originator = originator;
    	this.caretaker = caretaker;
    }

	/**
	 * 下棋
	 */
	@Override
	public void execute() {
		caretaker.saveMemento(originator.createMemento()); //保存备忘录  
	}
    
    /**
     * 悔棋  
     */
	@Override
    public void undo() {  
        originator.restoreMemento(caretaker.retrieveMemento());//撤销到上一个备忘录  
    }

}
