package com.designpattern.Memento.OfflineStorage;

import java.io.Serializable;

/**
 * 象棋备忘录角色  -- 实现序列化
 * @author Json<<json1990@foxmail.com>>
 */
public class ChessMemento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//操作的棋子
	private String piece;
	//所在位置
	private String location;  
	
	public ChessMemento() {
		
	}

    public ChessMemento(String piece,String location) {  
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
}

