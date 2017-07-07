package com.designpattern.builder;
/**
 * 导演类  Director
 * @author Json
*/
public class PenDirector {

	public Pen constructPen(PenBuilder pen_builder){
		//生产笔芯
		pen_builder.buildCartridge();
		//生产外壳
		pen_builder.buildShell();
		//组装笔
		return pen_builder.buildPen();
	}
}
