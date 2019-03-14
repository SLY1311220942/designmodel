package com.sly.designmodel.prototype.model;

import java.io.Serializable;

import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * _附件类
 * @author sly
 * @time 2019年3月6日
 */
public class Attachment implements Cloneable,Serializable{

	private static final long serialVersionUID = -442599304016883793L;
	
	public String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public Attachment clone() {
		try {
			Object object = super.clone();
			return (Attachment) object;
		} catch (CloneNotSupportedException e) {
			System.out.println(ExceptionUtils.getStackTrace(e));
		}
		return null;
	}
}

