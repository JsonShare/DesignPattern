package com.designpattern.Command.extend.MacroCommand;

/**
 * 具体命令 -- OS启动命令
 * @author Json
*/
public class OSStartCommand implements Command {
	private Computer computer;
	public OSStartCommand(Computer computer){
		this.computer = computer;
	}
	
	@Override
	public void execute() {
		computer.startOS();
	}
}
