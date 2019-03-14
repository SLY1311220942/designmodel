package com.sly.designmodel.factory.abstractfactory;

import com.sly.designmodel.factory.model.Sender;
import com.sly.designmodel.factory.model.impl.SmsSender;

/**
 * _短信发送对象工厂类
 * @author sly
 * @time 2019年3月6日
 */
public class SmsFactory implements Provider {
	
	/**
	 * _创建短信发送对象
	 * @return
	 * @author sly
	 * @time 2019年3月6日
	 */
	@Override
	public Sender produce() {
		return new SmsSender();
	}

}

