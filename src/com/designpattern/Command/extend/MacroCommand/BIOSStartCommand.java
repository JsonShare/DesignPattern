package com.designpattern.Command.extend.MacroCommand;

/**
 * 具体命令 -- BIOS启动命令
 * @author Json
*/
public class BIOSStartCommand implements Command {
	private Computer computer;
	public BIOSStartCommand(Computer computer){
		this.computer = computer;
	}
	
	@Override
	public void execute() {
		computer.startBIOS();
	}
}
