package com.sly.designmodel.decorator.decorator;

/**
 * Decorator装饰抽象类,实现了Component,从外类来扩展Component类的功能,但是对于Component来说,是无需知道Decorator的存在的
 * 
 * @author sly
 * @time 2019年3月7日
 */
public abstract class Decorator implements Component {
	protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if (component != null) {
			component.operation();
		}

	}

}
