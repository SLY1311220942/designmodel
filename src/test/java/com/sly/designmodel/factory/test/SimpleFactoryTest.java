package com.sly.designmodel.factory.test;

import org.junit.Test;

import com.sly.designmodel.factory.model.Sender;
import com.sly.designmodel.factory.simplefactory.SenderFactory;

/**
 * _简单工厂模式测试类
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class SimpleFactoryTest {

	/**
	 * _测试简单工厂模式
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	@Test
	public void test01() {
		//创建一个发邮件的sender
		Sender sender1 = SenderFactory.product("mail");
		sender1.send();
		
		//创建一个发短信的sender
		Sender sender2 = SenderFactory.product("sms");
		sender2.send();
	}
}
