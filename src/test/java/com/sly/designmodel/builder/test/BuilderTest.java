package com.sly.designmodel.builder.test;

import org.junit.Test;

import com.sly.designmodel.builder.builder.impl.ShortTruckBuilder;
import com.sly.designmodel.builder.builder.impl.SuvBuilder;
import com.sly.designmodel.builder.director.Director;
import com.sly.designmodel.builder.model.Car;

/**
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class BuilderTest {
	
	/**
	 * 
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	@Test
	public void test01() {
		Car car1 = Director.createCarByDirecotr(new SuvBuilder());
		System.out.println(car1);
		
		Car car2 = Director.createCarByDirecotr(new ShortTruckBuilder());
		System.out.println(car2);
		
	}
	
}

