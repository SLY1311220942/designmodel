package com.sly.designmodel.builder.builder.impl;

import com.sly.designmodel.builder.builder.IBuilder;
import com.sly.designmodel.builder.model.Car;

/**
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class ShortTruckBuilder implements IBuilder {
	
	private Car car = new Car();
	
	
	@Override
	public void buildCarframe() {
		car.setCarframe("结实的车架");
	}

	@Override
	public void buildWheel() {
		car.setWheel("宽大的轮胎");
	}

	@Override
	public void buildEngine() {
		car.setEngine("800匹澎湃动力");
	}

	@Override
	public void buildOiltank() {
		car.setOiltank("350L大油箱");
	}

	@Override
	public Car createCar() {
		return car;
	}

}

