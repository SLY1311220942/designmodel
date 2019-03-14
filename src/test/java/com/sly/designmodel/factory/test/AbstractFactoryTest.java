package com.sly.designmodel.factory.test;

import org.junit.Test;

import com.sly.designmodel.factory.abstractfactory.MailFactory;
import com.sly.designmodel.factory.abstractfactory.Provider;
import com.sly.designmodel.factory.abstractfactory.SmsFactory;
import com.sly.designmodel.factory.model.Sender;

/**
 * _抽象工厂模式测试类
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class AbstractFactoryTest {

	/**
	 * _测试抽象工厂模式
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	@Test
	public void test01() {
		Provider provider1 = new MailFactory();
		Sender sender1 = provider1.produce();
		sender1.send();
		
		Provider provider2 = new SmsFactory();
		Sender sender2 = provider2.produce();
		sender2.send();
	}
}
