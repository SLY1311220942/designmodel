package com.sly.designmodel.factory.abstractfactory;

import com.sly.designmodel.factory.model.Sender;

/**
 * _提供类
 * 
 * @author sly
 * @time 2019年3月6日
 */
public interface Provider {
	
	/**
	 * _创建发送对象
	 * 
	 * @return
	 * @author sly
	 * @time 2019年3月6日
	 */
	public Sender produce();
}
