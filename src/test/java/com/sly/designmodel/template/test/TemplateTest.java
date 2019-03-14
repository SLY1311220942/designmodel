package com.sly.designmodel.template.test;

import org.junit.Test;

import com.sly.designmodel.template.HouseA;
import com.sly.designmodel.template.HouseB;
import com.sly.designmodel.template.HouseTemplate;

/**
 * _模板模式测试类
 * @author sly
 * @time 2019年3月7日
 */
public class TemplateTest {
	/**
	 * _测试模板模式
	 * 
	 * @author sly
	 * @time 2019年3月7日
	 */
	@Test
	public void test01() {
		HouseTemplate houseTemplate1 = new HouseA("houseA",false);
		HouseTemplate houseTemplate2 = new HouseB("houseB");
		
		houseTemplate1.buildHouse();
		System.out.println("======================");
		houseTemplate2.buildHouse();
	}
}

