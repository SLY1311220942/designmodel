package com.sly.designmodel.observer.observer.impl;

import com.sly.designmodel.observer.observer.Observer;

/**
 * 股票观察者
 * @author sly
 * @time 2019年3月14日
 */
public class StockObserver implements Observer {
	
	private String name;

	public StockObserver(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println(name + ":2000点了,梭哈!");

	}

}
