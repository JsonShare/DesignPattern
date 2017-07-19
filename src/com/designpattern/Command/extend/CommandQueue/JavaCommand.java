package com.designpattern.Command.extend.CommandQueue;
/**
 * 具体命令 -- Java工程师执行任务
 * @author Json
*/
public class JavaCommand implements Command{
	//持有相应的接收者对象
    private JavaCoder javaCoder;
    //具体任务
    private String task;
    /**
     * 构造方法
     */
    public JavaCommand(JavaCoder javaCoder,String task){
        this.javaCoder = javaCoder;
        this.task = task;
    }
    
    @Override
    public void execute() {
        //通常会转调接收者对象的相应方法，让接收者来真正执行功能
    	javaCoder.work(this.task);
    }
}
