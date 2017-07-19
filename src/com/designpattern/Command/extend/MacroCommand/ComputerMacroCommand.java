package com.designpattern.Command.extend.MacroCommand;

import java.util.ArrayList;
/**
 * 宏命令接口实现
 * @author Json
*/
public class ComputerMacroCommand implements MacroCommand {
	private ArrayList<Command> commands;  
	//无参构造方法
	public ComputerMacroCommand(){
		commands = new ArrayList<Command>();
	}
	
	@Override
    public void addCommand(Command command){            
       commands.add(command);  
    } 
	
	@Override
    public void removeCommand(Command command){  
       commands.remove(command);  
    }  
	
	@Override
    public void execute(){   
       for (int i=0; i < commands.size(); i++){  
    	   commands.get(i).execute();  
       }  
    }   

}
