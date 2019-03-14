package com.sly.designmodel.prototype.shallowclone;

import org.apache.commons.lang3.exception.ExceptionUtils;

import com.sly.designmodel.prototype.model.Attachment;

/**
 * _周报类
 * @author sly
 * @time 2019年3月6日
 */
public class Weekly implements Cloneable {
	private String name;
	private Attachment attachment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public Weekly shallowClone() {
			Object object;
			try {
				object = super.clone();
				return (Weekly) object;
			} catch (CloneNotSupportedException e) {
				System.out.println(ExceptionUtils.getStackTrace(e));
			}
			return null;
		
	}
}
