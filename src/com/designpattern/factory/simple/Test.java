package com.designpattern.factory.simple;

/**
* 类说明 ：测试
*/
public class Test {
	public static void main(String[] args) {
		/**
		 * 客户要订购生产小米手机
		 */
		MobileFactory.product("xiaomi");
		/**
		 * 客户要订购生产华为手机
		 */
		MobileFactory.product("huawei");
		/**
		 * 客户要订购生产锤子手机
		 */
		MobileFactory.product("chuizi");
	}
}
