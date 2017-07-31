package com.designpattern.Mediator;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {

	public static void main(String[] args) {
		MessageMediator mediator = new MessageMediator();
		
		PeopleA a = new PeopleA(mediator,"A");
		PeopleB b = new PeopleB(mediator,"B");
		PeopleC c = new PeopleC(mediator,"C");
		
		mediator.setPeopleA(a);
		mediator.setPeopleB(b);
		mediator.setPeopleC(c);
		
		mediator.chat(a, "中午吃啥饭？");
		System.out.println();
		
		mediator.chat(b,"我想吃刀削面");
		System.out.println();

		mediator.chat(c,"我也想吃刀削面");
		System.out.println();
		
		mediator.chat(a, "行，那中午一起去吃刀削面吧");
		System.out.println();
	}
}
