package com.designpattern.strategy;
/**
* 类说明 ：活动入口
*/
public class ActivityEntry {
	
	public void activityEntry(String str){
		AbstractSaleActivity saleActivity = null;
		switch(str){
			case "618":
				saleActivity = new SaleActivity618(); 
				saleActivity.saleEvent();
				break;
			case "1111":
				saleActivity = new SaleActivity1111();
				saleActivity.saleEvent();
				break;
			case "1212":
				saleActivity = new SaleActivity1212();
				saleActivity.saleEvent();
				break;
			default:
				System.out.println("无具体活动!");break;
		}
	}
}
