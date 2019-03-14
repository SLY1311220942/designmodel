package com.sly.designmodel.proxy;

/**
 * Subject类,定义了RealSubject和Proxy的共用接口,这样就可以在任何使用RealSubject的地方都可以使用Proxy
 * 
 * @author sly
 * @time 2019年3月10日
 */
public interface Subject {
	public void request();
}
