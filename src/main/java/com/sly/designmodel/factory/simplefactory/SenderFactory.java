package com.sly.designmodel.factory.simplefactory;

import com.sly.designmodel.factory.model.Sender;
import com.sly.designmodel.factory.model.impl.MailSender;
import com.sly.designmodel.factory.model.impl.SmsSender;

/**
 * _普通的发送工厂类
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class SenderFactory {
	
	/**
	 * _创建发送对象
	 * 
	 * @param type
	 * @return
	 * @author sly
	 * @time 2019年3月6日
	 */
	public static Sender product(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		}
		System.out.println("类型错误！");
		return null;
	}

}
