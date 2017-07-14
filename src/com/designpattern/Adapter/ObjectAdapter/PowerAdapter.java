package com.designpattern.Adapter.ObjectAdapter;
/**
 * 电源适配器
 * PS: 适配器类，直接关联被适配类，同时实现标准接口  
 * @author Json
*/
public class PowerAdapter implements MyCharger{
	// 直接关联被适配类
	private RussiaSocket russiaSocket;
	// 可以通过构造函数传入具体需要适配的被适配类对象
	public PowerAdapter(RussiaSocket russiaSocket) {
		this.russiaSocket = russiaSocket;
	}
	
	@Override
	public void charge(){
		// 这里是使用委托的方式完成特殊功能
		System.out.println("我是适配类：双脚扁头充电->可以在->双脚圆形插孔充电.");
        this.russiaSocket.specificCharge();
	}
}
