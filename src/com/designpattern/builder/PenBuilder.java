package com.designpattern.builder;
/**
 * 抽象建造者  -- 笔builder
*/
public abstract interface PenBuilder {
	/**
	 * 生产笔芯
	 */
	abstract void buildCartridge();
	/**
	 * 生产外壳
	 */
	abstract void buildShell();
	/**
	 * 组装笔
	 */
	abstract Pen buildPen();
}
