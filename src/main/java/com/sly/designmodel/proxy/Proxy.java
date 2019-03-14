package com.sly.designmodel.proxy;
/**
 * Proxy类,保存一个引用使得代理可以访问实体,并提供一个与Subject的接口相同的接口,这样代理就可以用来代替实体
 * @author sly
 * @time 2019年3月10日
 */
public class Proxy implements Subject {

	private RealSubject realSubject;
	
	@Override
	public void request() {
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}
