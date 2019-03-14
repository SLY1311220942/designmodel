package com.sly.designmodel.builder.builder.impl;

import com.sly.designmodel.builder.builder.IBuilder;
import com.sly.designmodel.builder.model.Car;

/**
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class SuvBuilder implements IBuilder {
	
	private Car car = new Car();
	
	@Override
	public void buildCarframe() {
		car.setCarframe("松松垮垮的车架");
	}

	@Override
	public void buildWheel() {
		car.setWheel("又窄又小的轮子");
	}

	@Override
	public void buildEngine() {
		car.setEngine("假装还行");
	}

	@Override
	public void buildOiltank() {
		car.setOiltank("非常小的油箱");
	}

	@Override
	public Car createCar() {
		return car;
	}

}

