package com.designpattern.factory.simple;
/**
* 类说明 ：
*/
public class MobileFactory {
	/**
	 * 静态工厂方法
	 * @param mobiletype
	 * @return
	 */
	public static Mobile product(String mobiletype){
		Mobile mobile = null;  
        if ("xiaomi".equals(mobiletype)) {  
        	mobile = new XiaomiMobile();  
            System.out.println("生产小米手机.");  
        } else if ("huawei".equals(mobiletype)) {  
        	mobile = new HuaweiMobile();  
            System.out.println("生产华为手机.");  
        } else {  
            System.out.println("不能生产该手机类型.");  
        }  
        return mobile;  
	}
}
