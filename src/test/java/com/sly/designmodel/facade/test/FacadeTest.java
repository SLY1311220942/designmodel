package com.sly.designmodel.facade.test;

import org.junit.Test;

import com.sly.designmodel.facade.Facade;

/**
 * 外观模式测试类
 * @author sly
 * @time 2019年3月13日
 */
public class FacadeTest {
	
	@Test
	public void test01() {
		Facade facade = new Facade();
		facade.MethodA();
		facade.MethodB();
	}
	
	@Test
	public void test02() {
		System.out.println(1000 - 'A');
		int a = 1255;
		System.out.println((byte)a);
		
	}
	
}
