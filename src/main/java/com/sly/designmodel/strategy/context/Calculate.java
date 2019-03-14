package com.sly.designmodel.strategy.context;

import java.math.BigDecimal;

import com.sly.designmodel.strategy.strategy.Strategy;

/**
 * _上下文类
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class Calculate {
	private BigDecimal money;

	public Calculate() {
		
	}

	public Calculate(BigDecimal money) {
		this.money = money;
	}

	public void calculate(Strategy strategy) {
		strategy.algorithm(money);
	}

}
