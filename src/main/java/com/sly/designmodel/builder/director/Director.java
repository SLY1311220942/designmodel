package com.sly.designmodel.builder.director;

import com.sly.designmodel.builder.builder.IBuilder;
import com.sly.designmodel.builder.model.Car;

/**
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class Director {
	public static Car createCarByDirecotr(IBuilder builder) {
		builder.buildCarframe();
		builder.buildEngine();
		builder.buildOiltank();
		builder.buildWheel();
		return builder.createCar();
	}
}

