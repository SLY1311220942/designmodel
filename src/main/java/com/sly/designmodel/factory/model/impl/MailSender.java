package com.sly.designmodel.factory.model.impl;

import com.sly.designmodel.factory.model.Sender;

/**
 * _邮件发送
 * 
 * @author sly
 * @time 2019年3月6日
 */
public class MailSender implements Sender {

	/**
	 * _发送
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	@Override
	public void send() {
		System.out.println("发邮件");
	}

}
