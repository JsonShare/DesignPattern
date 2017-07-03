package com.designpattern.strategy;
/**
* 类说明 ：定义具体的促销活动 - 1212活动
*/
public class SaleActivity1212 implements AbstractSaleActivity{

	@Override
	public void saleEvent() {
		// TODO 业务逻辑
		System.out.println("双十二促销活动!");
	}
}
