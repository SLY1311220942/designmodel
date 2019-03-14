package com.sly.designmodel.facade;
/**
 * Facade外观类知道哪些子系统类负责处理请求,将客户的请求代理给恰当的子系统对象
 * @author sly
 * @time 2019年3月13日
 */
public class Facade {
	
	private SubSystemOne subSystemOne;
	private SubSystemTwo subSystemTwo;
	private SubSystemThree subSystemThree;
	
	public Facade() {
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
	}
	
	/**
	 * 方法组A
	 * 
	 * @author sly
	 * @time 2019年3月13日
	 */
	public void MethodA() {
		System.out.println("方法组A");
		subSystemOne.method();
		subSystemTwo.method();
	}
	
	/**
	 * 方法组B
	 * 
	 * @author sly
	 * @time 2019年3月13日
	 */
	public void MethodB() {
		System.out.println("方法组B");
		subSystemOne.method();
		subSystemTwo.method();
		subSystemThree.method();
	}
}
