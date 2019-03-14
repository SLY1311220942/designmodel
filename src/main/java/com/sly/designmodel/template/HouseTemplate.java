package com.sly.designmodel.template;

/**
 * _抽象模板类
 * 
 * @author sly
 * @time 2019年3月7日
 */
public abstract class HouseTemplate {
	protected String name;

	public HouseTemplate(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected abstract void buildDoor();

	protected abstract void buildWindow();

	protected abstract void buildWall();

	protected abstract void buildBase();
	
	protected abstract void buildToilet();
	
	//钩子方法
	public boolean isBuildToilet() {
		return true;
	}

	public final void buildHouse() {
		buildDoor();
		buildWindow();
		buildWall();
		buildBase();
		if(isBuildToilet()) {
			
			buildToilet();
		}
	}
}
