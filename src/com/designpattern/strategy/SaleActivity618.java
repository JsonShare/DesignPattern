package com.designpattern.strategy;
/**
* 类说明 ：定义具体的促销活动 - 518活动
*/
public class SaleActivity618 implements AbstractSaleActivity {

	@Override
	public void saleEvent() {
		//TODO 业务逻辑
		System.out.println("618促销活动!");
	}
}
