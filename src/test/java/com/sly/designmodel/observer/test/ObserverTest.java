package com.sly.designmodel.observer.test;

import org.junit.Test;

import com.sly.designmodel.observer.informer.Informer;
import com.sly.designmodel.observer.informer.impl.StockInformer;
import com.sly.designmodel.observer.informer.impl.TelevisionInformer;
import com.sly.designmodel.observer.observer.impl.StockObserver;
import com.sly.designmodel.observer.observer.impl.TelevisionObserver;

/**
 * 观察者模式测试类
 * @author sly
 * @time 2019年3月14日
 */
public class ObserverTest {
	
	/**
	 * 测试观察者模式
	 * 
	 * @author sly
	 * @time 2019年3月14日
	 */
	@Test
	public void test01() {
		Informer informer1 = new StockInformer();
		Informer informer2 = new TelevisionInformer();
		
		StockObserver stockObserver1 = new StockObserver("小明");
		StockObserver stockObserver2 = new StockObserver("中明");
		StockObserver stockObserver3 = new StockObserver("老明");
		informer1.addObserver(stockObserver1);
		informer1.addObserver(stockObserver2);
		informer1.addObserver(stockObserver3);
		informer1.subObserver(stockObserver3);
		
		informer2.addObserver(new TelevisionObserver("小红"));
		informer2.addObserver(new TelevisionObserver("小明"));
		
		informer1.notifyActive();
		informer2.notifyActive();
	}
}
