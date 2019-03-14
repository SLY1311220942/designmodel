package com.sly.designmodel.prototype.test;

import org.junit.Test;

import com.sly.designmodel.prototype.deepclone.Monthly;
import com.sly.designmodel.prototype.model.Attachment;
import com.sly.designmodel.prototype.shallowclone.Weekly;

/**
 * _原型模式测试类
 * @author sly
 * @time 2019年3月6日
 */
public class PrototypeTest {
	
	/**
	 * _浅克隆测试
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	@Test
	public void shallowTest() {
		Attachment attachment = new Attachment();
		attachment.setInfo("info1");
		Weekly weekly1 = new Weekly();
		weekly1.setAttachment(attachment);
		
		Weekly weekly2 = weekly1.shallowClone();
		
		System.out.println("周报一等于周报二:" + (weekly1 == weekly2));
		System.out.println("附件一等于附件二:" + (weekly1.getAttachment() == weekly2.getAttachment()));
		
		System.out.println(weekly1.getAttachment().getInfo());
		System.out.println(weekly2.getAttachment().getInfo());
		
		weekly1.getAttachment().setInfo("info2");
		
		System.out.println(weekly1.getAttachment().getInfo());
		System.out.println(weekly2.getAttachment().getInfo());
	}
	
	/**
	 * _深克隆测试
	 * 
	 * @author sly
	 * @time 2019年3月6日
	 */
	@Test
	public void deepTest() {
		Attachment attachment = new Attachment();
		attachment.setInfo("info1");
		Monthly monthly1 = new Monthly();
		monthly1.setAttachment(attachment);
		
		Monthly monthly2 = monthly1.deepColne();
		
		System.out.println("月报一等于月报二:" + (monthly1 == monthly2));
		System.out.println("附件一等于附件二:" + (monthly1.getAttachment() == monthly2.getAttachment()));
		
		System.out.println(monthly1.getAttachment().getInfo());
		System.out.println(monthly2.getAttachment().getInfo());
		
		monthly1.getAttachment().setInfo("info2");
		monthly2.getAttachment().setInfo("info3");
		
		System.out.println(monthly1.getAttachment().getInfo());
		System.out.println(monthly2.getAttachment().getInfo());
	}
	
	/**
	 * _深克隆序列化方式测试
	 * 
	 * @author sly
	 * @throws Exception 
	 * @time 2019年3月6日
	 */
	@Test
	public void deepSerizableTest() throws Exception {
		Attachment attachment = new Attachment();
		attachment.setInfo("info1");
		Monthly monthly1 = new Monthly();
		monthly1.setAttachment(attachment);
		
		Monthly monthly2 = monthly1.deepCloneBySerizable();
		
		System.out.println("月报一等于月报二:" + (monthly1 == monthly2));
		System.out.println("附件一等于附件二:" + (monthly1.getAttachment() == monthly2.getAttachment()));
		
		System.out.println(monthly1.getAttachment().getInfo());
		System.out.println(monthly2.getAttachment().getInfo());
		
		monthly1.getAttachment().setInfo("info2");
		monthly2.getAttachment().setInfo("info3");
		
		System.out.println(monthly1.getAttachment().getInfo());
		System.out.println(monthly2.getAttachment().getInfo());
	}
}

