package com.sly.designmodel.decorator.decorator;

/**
 * ConcreteDecorator就是具体的装饰对象,起到给Component添加职责的功能
 * 
 * @author sly
 * @time 2019年3月7日
 */
public class ConcreteDecoratorB extends Decorator {
	@Override
	public void operation() {
		super.operation();
		addedBehavior();
	}

	/**
	 * B独有方法,用来区别于A
	 * 
	 * @author sly
	 * @time 2019年3月7日
	 */
	private void addedBehavior() {
		System.out.println("B add Behavior");
	}
}
