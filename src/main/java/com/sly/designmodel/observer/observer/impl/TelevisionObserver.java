package com.sly.designmodel.observer.observer.impl;

import com.sly.designmodel.observer.observer.Observer;

/**
 * 
 * @author sly
 * @time 2019年3月14日
 */
public class TelevisionObserver implements Observer {
	
	private String name;
	
	public TelevisionObserver(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println(name + ":节目开始了,打开电视看视频!");
	}

}
