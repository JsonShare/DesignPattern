package com.designpattern.Adapter.ClassAdapter;
/**
 * 测试
 * @author Json
*/
public class Test {
	public static void main(String[] args) {
		MyCharger charger = new PowerAdapter();
		//通过适配器调用特殊功能
		charger.charge();
	}
}
