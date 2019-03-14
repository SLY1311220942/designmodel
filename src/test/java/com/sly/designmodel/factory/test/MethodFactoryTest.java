package com.sly.designmodel.factory.test;

import org.junit.Test;

import com.sly.designmodel.factory.methodfactory.MethodFactory;
import com.sly.designmodel.factory.model.Sender;

/**
 * _多方法的工厂模式测试类
 * @author sly
 * @time 2019年3月6日
 */
public class MethodFactoryTest {
	
	/**
	 * _测试多方法的工厂模式
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	@Test
	public void test01() {
		Sender sender1 = MethodFactory.prodMailSender();
		sender1.send();
		
		Sender sender2 = MethodFactory.prodSmsSender();
		sender2.send();
		
	}
}

