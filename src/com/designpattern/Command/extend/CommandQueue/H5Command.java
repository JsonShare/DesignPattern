package com.designpattern.Command.extend.CommandQueue;
/**
 * 具体命令 -- H5工程师执行任务
 * @author Json
*/
public class H5Command implements Command{
	//持有相应的接收者对象
    private H5Coder h5Coder;
    //具体任务
    private String task;
    /**
     * 构造方法
     */
    public H5Command(H5Coder h5Coder,String task){
        this.h5Coder = h5Coder;
        this.task = task;
    }
    
    @Override
    public void execute() {
        //通常会转调接收者对象的相应方法，让接收者来真正执行功能
    	h5Coder.work(this.task);
    }
}
