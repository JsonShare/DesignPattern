package com.designpattern.strategy;
/**
* 类说明 ：定义具体的促销活动 - 1111活动
*/
public class SaleActivity1111 implements AbstractSaleActivity {

	@Override
	public void saleEvent() {
		// TODO 业务逻辑
		System.out.println("双十一促销活动!");
	}
}
