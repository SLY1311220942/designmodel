package com.sly.designmodel.strategy.test;

import java.math.BigDecimal;

import org.junit.Test;

import com.sly.designmodel.strategy.context.Calculate;
import com.sly.designmodel.strategy.strategy.ConcreteStrategyA;
import com.sly.designmodel.strategy.strategy.ConcreteStrategyB;
import com.sly.designmodel.strategy.strategy.ConcreteStrategyC;

/**
 * _策略模式测试类
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class StrategyTest {

	/**
	 * _测试策略模式
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	@Test
	public void test01() {
		Calculate calculate = new Calculate(new BigDecimal("100"));
		
		calculate.calculate(new ConcreteStrategyA());
		calculate.calculate(new ConcreteStrategyB());
		calculate.calculate(new ConcreteStrategyC());
	}
}
