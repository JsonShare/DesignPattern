package com.designpattern.Command.extend.MacroCommand;

/**
 * 具体命令 -- MBR启动命令
 * @author Json
*/
public class MBRStartCommand implements Command {
	private Computer computer;
	public MBRStartCommand(Computer computer){
		this.computer = computer;
	}
	
	@Override
	public void execute() {
		computer.startMBR();
	}
}
