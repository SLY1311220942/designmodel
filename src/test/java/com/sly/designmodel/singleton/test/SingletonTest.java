package com.sly.designmodel.singleton.test;

import org.junit.Test;

import com.sly.designmodel.singleton.SingletonDoubleCheckedLockingPattern;
import com.sly.designmodel.singleton.SingletonEnum;
import com.sly.designmodel.singleton.SingletonHungry;
import com.sly.designmodel.singleton.SingletonLazy;
import com.sly.designmodel.singleton.SingletonStaticNestedClass;

/**
 * 
 * @author sly
 * @time 2019年3月4日
 */
public class SingletonTest {

	/**
	 * 枚举单例模式测试
	 * 
	 * @author sly
	 * @time 2019年3月4日
	 */
	@Test
	public void test01() {
		SingletonEnum instance1 = SingletonEnum.INSTANCE;
		instance1.setId("IdId");
		System.out.println(instance1.getId());
		SingletonEnum instance2 = SingletonEnum.INSTANCE;
		System.out.println(instance2.getId());
	}

	/**
	 * 懒汉单例模式测试
	 * 
	 * @author sly
	 * @time 2019年3月4日
	 */
	@Test
	public void test02() {
		SingletonLazy instance1 = SingletonLazy.getInstance();
		instance1.setId("IdId");
		System.out.println(instance1.getId());
		SingletonLazy instance2 = SingletonLazy.getInstance();
		System.out.println(instance2.getId());
	}

	/**
	 * 饿汉单例模式测试
	 * 
	 * @author sly
	 * @time 2019年3月4日
	 */
	@Test
	public void test03() {
		SingletonHungry instance1 = SingletonHungry.getInstance();
		instance1.setId("IdId");
		System.out.println(instance1.getId());
		SingletonHungry instance2 = SingletonHungry.getInstance();
		System.out.println(instance2.getId());
	}
	
	/**
	 * 双重检验锁单例模式测试
	 * 
	 * @author sly
	 * @time 2019年3月4日
	 */
	@Test
	public void test04() {
		SingletonDoubleCheckedLockingPattern instance1 = SingletonDoubleCheckedLockingPattern.getInstance();
		instance1.setId("IdId");
		System.out.println(instance1.getId());
		SingletonDoubleCheckedLockingPattern instance2 = SingletonDoubleCheckedLockingPattern.getInstance();
		System.out.println(instance2.getId());
	}
	
	/**
	 * 静态内部类
	 * 
	 * @author sly
	 * @time 2019年3月4日
	 */
	@Test
	public void test05() {
		SingletonStaticNestedClass instance1 = SingletonStaticNestedClass.getInstance();
		instance1.setId("IdId");
		System.out.println(instance1.getId());
		SingletonStaticNestedClass instance2 = SingletonStaticNestedClass.getInstance();
		System.out.println(instance2.getId());
	}
}
