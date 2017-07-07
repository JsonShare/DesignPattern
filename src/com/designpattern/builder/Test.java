package com.designpattern.builder;

import com.designpattern.builder.impl.BallpointPenBuilder;
import com.designpattern.builder.impl.BrushPenBuilder;

/**
 * 测试
 * @author Json
*/
public class Test {
	public static void main(String[] args) {
		PenDirector director = new PenDirector();
		Pen ballpointpen = director.constructPen(new BallpointPenBuilder());
		Pen brushpen = director.constructPen(new BrushPenBuilder());
	}
}
