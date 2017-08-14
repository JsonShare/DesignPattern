package com.designpattern.ChainOfResponsibility;

import com.designpattern.utils.LocationUtil;

/**
 * 肯德基 -- 北京酒仙桥分店
 * @author Json<<json1990@foxmail.com>>
 */
public class JiuXianQiaoSubbranch extends KFC{
	//最大配送距离
	private int maxDeliveryDistance = 500;
	
	private int x = 800;//分店的横坐标，用于判断距离
    private int y = 200;//分店的纵坐标，用于判断距离
	
    public void handleRequest(int _x,int _y) {
    	
		//在配送范围内，可配送
		if(LocationUtil.getDistance(_x, _y, x, y) <= maxDeliveryDistance){
			//如果属于自己处理的职责范围，就在这里处理请求
			//具体的处理代码
			System.out.println("酒仙桥分店已接单，老司机马上派送");
		}else{
			//如果不属于自己处理的职责范围，那就判断是否还有后继的职责对象
			//如果有，就转发请求给后继的职责对象
			//如果没有，什么都不做，自然结束
			if(this.successor!=null){
				this.successor.handleRequest(_x,_y);
			}
		}
	}
}
