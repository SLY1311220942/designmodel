package com.sly.designmodel.state.test;

import org.junit.Test;

import com.sly.designmodel.state.ConcreteStateA;
import com.sly.designmodel.state.Context;

/**
 * 状态模式测试类
 * @author sly
 * @time 2019年3月24日
 */
public class StateTest {
	
	/**
	 * 测试状态模式
	 * 
	 * @author sly
	 * @time 2019年3月24日
	 */
	@Test
	public void test01() {
		//设置初始状态
		Context context = new Context(new ConcreteStateA());
		//每执行一次状态反转
		context.request();
		context.request();
		context.request();
		context.request();
		context.request();
	}
}
