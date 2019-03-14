package com.sly.designmodel.singleton;

/**
 * 
 * @author sly
 * @time 2019年3月4日
 */
public class SingletonLazy {
	private static SingletonLazy instance;

	private SingletonLazy() {
	}

	/**
	 * _懒汉式,线程安全但是效率不行,之类串行执行获取实例方法
	 * @return
	 * @author sly
	 * @time 2019年3月4日
	 */
	public static synchronized SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
