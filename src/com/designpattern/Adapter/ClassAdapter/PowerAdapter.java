package com.designpattern.Adapter.ClassAdapter;
/**
 * 电源适配器
 * PS: 适配器类，继承了被适配类，同时实现标准接口
 * @author Json
*/
public class PowerAdapter extends RussiaSocket implements MyCharger{

	@Override
	public void charge() {
		// 这里是使用委托的方式完成特殊功能
		System.out.println("我是适配类：双脚扁头充电->可以在->双脚圆形插孔充电.");
        this.specificCharge();
	}
}
