package com.sly.designmodel.strategy.strategy;

import java.math.BigDecimal;

/**
 * _策略抽象类
 * @author sly
 * @time 2019年3月6日
 */
public interface Strategy {
	/**
	 * _运算规则
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	public abstract void algorithm(BigDecimal money);
}
