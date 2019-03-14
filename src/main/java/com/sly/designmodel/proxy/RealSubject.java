package com.sly.designmodel.proxy;
/**
 * RealSubject类,定义了Proxy所代理的真实实体
 * @author sly
 * @time 2019年3月10日
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("真实的请求!");
	}

}
