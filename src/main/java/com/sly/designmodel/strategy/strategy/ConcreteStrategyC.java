package com.sly.designmodel.strategy.strategy;

import java.math.BigDecimal;

/**
 * _具体策略C
 * @author sly
 * @time 2019年3月6日
 */
public class ConcreteStrategyC implements Strategy {

	@Override
	public void algorithm(BigDecimal money) {
		System.out.println("原价:" + money + "算法C实现不打折:" + money);
	}

}
