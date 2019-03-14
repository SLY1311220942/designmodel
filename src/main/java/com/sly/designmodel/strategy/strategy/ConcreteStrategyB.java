package com.sly.designmodel.strategy.strategy;

import java.math.BigDecimal;

/**
 * _具体策略B
 * @author sly
 * @time 2019年3月6日
 */
public class ConcreteStrategyB implements Strategy {

	@Override
	public void algorithm(BigDecimal money) {
		System.out.println("原价:" + money + "算法B实现打8折:" + money.multiply(new BigDecimal("0.8")));
	}

}
