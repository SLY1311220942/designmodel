package com.sly.designmodel.observer.informer;

import com.sly.designmodel.observer.observer.Observer;

/**
 * 通知者接口
 * 
 * @author sly
 * @time 2019年3月14日
 */
public interface Informer {
	/**
	 * 添加观察者
	 * 
	 * @param observer
	 * @author sly
	 * @time 2019年3月14日
	 */
	public void addObserver(Observer observer);

	/**
	 * 减去观察者
	 * 
	 * @param observer
	 * @author sly
	 * @time 2019年3月14日
	 */
	public void subObserver(Observer observer);

	/**
	 * 通知观察者
	 * 
	 * @author sly
	 * @time 2019年3月14日
	 */
	public void notifyActive();
}
