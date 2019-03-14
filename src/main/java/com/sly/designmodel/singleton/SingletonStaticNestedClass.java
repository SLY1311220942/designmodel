package com.sly.designmodel.singleton;

/**
 * 这种写法仍然使用JVM本身机制保证了线程安全问题；由于 SingletonHolder 是私有的，
 * 除了 getInstance() 之外没有办法访问它，因此它是懒汉式的；同时读取实例的时候不会
 * 进行同步，没有性能缺陷；也不依赖 JDK 版本。
 * @author sly
 * @time 2019年3月4日
 */
public class SingletonStaticNestedClass {
	private static class SingletonHolder {
		private static final SingletonStaticNestedClass INSTANCE = new SingletonStaticNestedClass();
	}

	private SingletonStaticNestedClass() {
	}

	public static final SingletonStaticNestedClass getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
