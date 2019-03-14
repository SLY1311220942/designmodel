package com.sly.designmodel.builder.builder;

import com.sly.designmodel.builder.model.Car;

/**
 * _建造接口
 * 
 * @author sly
 * @time 2019年3月6日
 */
public interface IBuilder {
	/**
	 * _建造车架
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	public void buildCarframe();
	
	/**
	 * _建造车轮
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	public void buildWheel();
	
	/**
	 * _建造引擎
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	public void buildEngine();
	
	/**
	 * _建造油箱
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	public void buildOiltank();
	
	/**
	 * _建造车对象
	 * @return
	 * @author sly
	 * @time 2019年3月6日
	 */
	public Car createCar();
}
