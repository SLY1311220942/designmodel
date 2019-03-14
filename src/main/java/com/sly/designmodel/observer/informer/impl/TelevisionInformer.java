package com.sly.designmodel.observer.informer.impl;

import java.util.ArrayList;
import java.util.List;

import com.sly.designmodel.observer.informer.Informer;
import com.sly.designmodel.observer.observer.Observer;

/**
 * 电视节目
 * @author sly
 * @time 2019年3月14日
 */
public class TelevisionInformer implements Informer {
	
	private List<Observer> observers = new ArrayList<>();
	
	/**
	 * 添加观察者
	 * 
	 * @param observer
	 * @author sly
	 * @time 2019年3月14日
	 */
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);

	}

	/**
	 * 减去观察者
	 * 
	 * @param observer
	 * @author sly
	 * @time 2019年3月14日
	 */
	@Override
	public void subObserver(Observer observer) {
		observers.remove(observer);

	}

	/**
	 * 通知观察者买股票
	 * 
	 * @author sly
	 * @time 2019年3月14日
	 */
	@Override
	public void notifyActive() {
		System.out.println("电视开播了");
		for (Observer observer : observers) {
			observer.update();
		}

	}

}
