package com.designpattern.Memento.MutilCheckpoints;

/**
 * 象棋原发器对象
 * @author Json<<json1990@foxmail.com>>
 */
public class ChessOriginator {
	//操作的棋子
	private String piece;
	//所在位置
	private String location;
	
	public ChessOriginator() {
		
	}

    public ChessOriginator(String piece,String location) {  
    	this.piece = piece;
        this.location = location;  
    }

	public String getPiece() {
		return piece;
	}

	public void setPiece(String piece) {
		this.piece = piece;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}  
	  
	//保存状态  
	public ChessMemento createMemento() {
	    return new ChessMemento(this.piece,this.location);  
	}  
	  
	//恢复状态  
	public void restoreMemento(ChessMemento memento) {
		this.piece = memento.getPiece();
        this.location = memento.getLocation();   
	}  
}
