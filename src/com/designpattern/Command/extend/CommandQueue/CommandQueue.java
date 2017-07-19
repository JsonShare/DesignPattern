package com.designpattern.Command.extend.CommandQueue;

import java.util.ArrayList;

/**
 * CommandQueue命令队列类
 * @author Json
*/
public class CommandQueue {
	//定义一个ArrayList来存储命令队列    
    private ArrayList<Command> commands = new ArrayList<Command>();    
        
    public void addCommand(Command command) {
        commands.add(command);    
    }    
        
    public void removeCommand(Command command) {    
        commands.remove(command);    
    }    
        
    //循环调用每一个命令对象的execute()方法
    public void execute() {    
        for(Command command : commands) {    
        	command.execute();    
        }    
    }    
}
