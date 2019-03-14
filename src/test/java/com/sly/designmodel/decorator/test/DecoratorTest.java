package com.sly.designmodel.decorator.test;

import org.junit.Test;

import com.sly.designmodel.decorator.decorator.ConcreteComponent;
import com.sly.designmodel.decorator.decorator.ConcreteDecoratorA;
import com.sly.designmodel.decorator.decorator.ConcreteDecoratorB;

/**
 * 
 * @author sly
 * @time 2019年3月7日
 */
public class DecoratorTest {
	
	/**
	 * _基本测试,concreteDecoratorB执行operation时它里面的component对象时concreteDecoratorA,
	 * _此时会先执行concreteDecoratorA的operation然后执行concreteDecoratorB的特有方法,开始执行
	 * _concreteDecoratorA的operation方法时,此时concreteDecoratorA里的component对象是concreteComponent,
	 * _此时会先执行concreteComponent的operation方法,执行完concreteComponent的operation后执行concreteDecoratorA
	 * _的特有方法,只行完concreteDecoratorA的特有方法后执行concreteDecoratorB的特有方法,结束!
	 * @author sly
	 * @time 2019年3月7日
	 */
	@Test
	public void test01() {
		ConcreteComponent concreteComponent = new ConcreteComponent();
		ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
		ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
		
		concreteDecoratorA.setComponent(concreteComponent);
		concreteDecoratorB.setComponent(concreteDecoratorA);
		
		concreteDecoratorB.operation();
		
	}
}
