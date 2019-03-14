package com.sly.designmodel.decorator.decorator;

/**
 * ConcreteDecorator就是具体的装饰对象,起到给Component添加职责的功能
 * 
 * @author sly
 * @time 2019年3月7日
 */
public class ConcreteDecoratorA extends Decorator {
	/**
	 * A独有属性,用来区别于B
	 */
	private String addedState;

	@Override
	public void operation() {
		super.operation();
		addedState = "New State";
		System.out.println(addedState);
	}
}
