package com.designpattern.builder.impl;

import com.designpattern.builder.BrushPen;
import com.designpattern.builder.Pen;
import com.designpattern.builder.PenBuilder;

/**
 * 建造者（具体）  -- 画笔builder
 * @author Json
*/
public class BrushPenBuilder implements PenBuilder{
	
	Pen pen;
	public BrushPenBuilder(){
		pen = new BrushPen();
	}
	
	@Override
	public void buildCartridge() {
		pen.setCartridge("画笔笔芯");
	}

	@Override
	public void buildShell() {
		pen.setShell("画笔外壳");
	}

	@Override
	public Pen buildPen() {
		return pen;
	}

}
