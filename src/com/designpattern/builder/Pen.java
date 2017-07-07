package com.designpattern.builder;
/**
 * 笔  -- 抽象产品类
 * @author Json
*/
public abstract class Pen {
	/**笔芯**/
	private String cartridge;
	/**外壳**/
	private String shell;
	
	public String getCartridge() {
		return cartridge;
	}
	public void setCartridge(String cartridge) {
		this.cartridge = cartridge;
	}
	public String getShell() {
		return shell;
	}
	public void setShell(String shell) {
		this.shell = shell;
	}
}
