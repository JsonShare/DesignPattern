package com.designpattern.builder.impl;

import com.designpattern.builder.BallpointPen;
import com.designpattern.builder.Pen;
import com.designpattern.builder.PenBuilder;

/**
 * 建造者（具体）  -- 圆珠笔builder
 * @author Json
*/
public class BallpointPenBuilder implements PenBuilder{
	
	Pen pen;
	public BallpointPenBuilder(){
		pen = new BallpointPen();
	}
	
	@Override
	public void buildCartridge() {
		pen.setCartridge("圆珠笔笔芯");
	}

	@Override
	public void buildShell() {
		pen.setShell("圆珠笔外壳");
	}

	@Override
	public Pen buildPen() {
		return pen;
	}

}
