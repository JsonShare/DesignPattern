package com.designpattern.singleton;
 
/**
 * 网站计数器
 */
class WebCounter {
    private int count = 0;
 
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
 
/**
 * 用户访问
 */
class Visitor{
    public WebCounter webCounter;
    public Visitor(WebCounter mwebCounter){
        webCounter = mwebCounter;
    }
    //访问
    public void visit(){
        webCounter.setCount(webCounter.getCount()+1);;
    }
}
/**
 * 模拟用户访问网站
 */
public class SingleTest{
    public static void main(String[] args){
        WebCounter webCounter1 = new WebCounter();
        WebCounter webCounter2 = new WebCounter();
        Visitor visitor1 = new Visitor(webCounter1);
        Visitor visitor2 = new Visitor(webCounter2);
 
        System.out.println("是不是同一个网站？");
        if(webCounter1.equals(webCounter2)){
            System.out.println("是");
        }else {            
        	System.out.println("不是");
        }
        //visitor1访问该网站
        visitor1.visit();
        System.out.println("访问量：" + webCounter1.getCount());
        //visitor2访问该网站
        visitor2.visit();
        System.out.println("访问量：" + webCounter2.getCount());
    }
}