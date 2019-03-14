package com.sly.designmodel.decorator.decorator;

/**
 * ConcreteComponent是定义了一个具体的对象,也可以给这个对象添加一些职责
 * 
 * @author sly
 * @time 2019年3月7日
 */
public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		System.out.println("具体对象的操作!");
	}

}
