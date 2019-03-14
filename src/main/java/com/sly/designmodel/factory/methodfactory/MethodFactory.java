package com.sly.designmodel.factory.methodfactory;

import com.sly.designmodel.factory.model.Sender;
import com.sly.designmodel.factory.model.impl.MailSender;
import com.sly.designmodel.factory.model.impl.SmsSender;

/**
 * _多个方法的发送工厂类
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class MethodFactory {

	/**
	 * _创建一个邮件发送对象
	 * 
	 * @return
	 * @author sly
	 * @time 2019年3月6日
	 */
	public static Sender prodMailSender() {
		return new MailSender();
	}

	/**
	 * _创建一个短信发送对象
	 * 
	 * @return
	 * @author sly
	 * @time 2019年3月6日
	 */
	public static Sender prodSmsSender() {
		return new SmsSender();
	}
}
