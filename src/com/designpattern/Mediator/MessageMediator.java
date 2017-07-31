package com.designpattern.Mediator;

/**
 * 具体中介者类
 * @author Json<<json1990@foxmail.com>>
 */
public class MessageMediator implements Mediator {
	//持有并维护人员A
    private PeopleA A;
    //持有并维护人员B
    private PeopleB B;    
    //持有并维护人员C
    private PeopleC C;    

    public void setPeopleA(PeopleA A) {
        this.A = A;
    }

    public void setPeopleB(PeopleB B) {
        this.B = B;
    }
    
    public void sePeopleC(PeopleC C) {
    	this.C = C;
    }

    /**
     * 发送消息
     */
    @Override
    public void chat(People p,String message) {
    	if (p instanceof PeopleA) {
    		A.send(message);
			B.receive(message);
			C.receive(message); 
		} else if (p instanceof PeopleB) {
			B.send(message);
			A.receive(message);
			C.receive(message);
		} else if (p instanceof PeopleC) {
			C.send(message);
			A.receive(message);
			B.receive(message);
		} 
    }
}
