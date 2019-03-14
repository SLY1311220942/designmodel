package com.sly.designmodel.proxy.test;

import org.junit.Test;

import com.sly.designmodel.proxy.Proxy;

/**
 * _代理模式测试类
 * 
 * @author sly
 * @time 2019年3月10日
 */
public class ProxyTest {

	/**
	 * _测试代理模式
	 * 
	 * @author sly
	 * @time 2019年3月10日
	 */
	@Test
	public void test01() {
		Proxy proxy = new Proxy();
		proxy.request();

	}
}
