package com.sly.designmodel.singleton;

/**
 * 
 * @author sly
 * @time 2019年3月4日
 */
public enum SingletonEnum {
	INSTANCE;
	
	public String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}

