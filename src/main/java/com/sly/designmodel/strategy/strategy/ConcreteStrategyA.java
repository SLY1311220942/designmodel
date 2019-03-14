package com.sly.designmodel.strategy.strategy;

import java.math.BigDecimal;

/**
 * _具体策略A
 * @author sly
 * @time 2019年3月6日
 */
public class ConcreteStrategyA implements Strategy {

	@Override
	public void algorithm(BigDecimal money) {
		System.out.println("原价:" + money + "算法A实现打七折:" + money.multiply(new BigDecimal("0.7")));
	}

}
