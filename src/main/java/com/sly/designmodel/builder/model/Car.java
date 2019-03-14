package com.sly.designmodel.builder.model;

import java.io.Serializable;

/**
 * _汽车实体类
 * @author sly
 * @time 2019年3月6日
 */
public class Car implements Serializable{

	private static final long serialVersionUID = 8738667978935000606L;
	
	private String wheel;
	private String engine;
	private String carframe;
	private String oiltank;
	public String getWheel() {
		return wheel;
	}
	public void setWheel(String wheel) {
		this.wheel = wheel;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getCarframe() {
		return carframe;
	}
	public void setCarframe(String carframe) {
		this.carframe = carframe;
	}
	public String getOiltank() {
		return oiltank;
	}
	public void setOiltank(String oiltank) {
		this.oiltank = oiltank;
	}
	
	@Override
	public String toString() {
		return carframe + ":" + wheel + ":" + engine + ":" + oiltank;
	}
}

