package com.sly.designmodel.template;

/**
 * 
 * @author sly
 * @time 2019年3月7日
 */
public class HouseA extends HouseTemplate {
	
	private boolean isBuildToilet;

	
	
	public HouseA(String name) {
		super(name);
	}
	
	public HouseA(String name,boolean isBuildToilet){
		super(name);
		this.isBuildToilet = isBuildToilet;
	}

	@Override
	protected void buildDoor() {
		System.out.println(name + "的门要采用防盗门");
	}

	@Override
	protected void buildWindow() {
		System.out.println(name + "的窗户要面向北方");
	}

	@Override
	protected void buildWall() {
		System.out.println(name + "的墙使用大理石建造");
	}

	@Override
	protected void buildBase() {
		System.out.println(name + "的地基使用钢铁地基");
	}

	@Override
	protected void buildToilet() {
		System.out.println(name + "的厕所建在东南角");
	}

	public boolean isBuildToilet() {
		return isBuildToilet;
	}

}
