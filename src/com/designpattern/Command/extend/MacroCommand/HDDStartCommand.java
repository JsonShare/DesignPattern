package com.designpattern.Command.extend.MacroCommand;

/**
 * 具体命令 -- HDD启动命令
 * @author Json
*/
public class HDDStartCommand implements Command {
	private Computer computer;
	public HDDStartCommand(Computer computer){
		this.computer = computer;
	}
	
	@Override
	public void execute() {
		computer.startHDD();
	}
}
