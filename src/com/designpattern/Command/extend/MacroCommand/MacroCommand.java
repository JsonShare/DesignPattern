package com.designpattern.Command.extend.MacroCommand;

/**
 * 宏命令接口
 * @author Json
*/
public interface MacroCommand extends Command {
	/**
	 * 宏命令的管理方法
	 * 添加命令
	 */
	void addCommand(Command command);
	/**
	 * 宏命令的管理方法
	 * 移除命令
	 */
	void removeCommand(Command command);
}
