package com.iterlife.designpattern.builder;


/**
 * @Description:com.iterlife.designpattern.builder.Product.java
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ����10:53:53
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Product {
	private String	productName;

	public void doSomething() {
		System.out.println("[" + this.productName + "]:Product.doSomething()");
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
}