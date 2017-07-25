package com.designpattern.bridge.solution_1;
/**
 * 消息统一接口
 * @author Json
*/
public interface Message {
	/**
	 * 发送消息
	 * @param message 消息内容
	 * @param users 接收人
	 */
	public void send(String message,String users);
}
