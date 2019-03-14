package com.sly.designmodel.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.commons.lang3.exception.ExceptionUtils;

import com.sly.designmodel.prototype.model.Attachment;

/**
 * _月报类
 * @author sly
 * @time 2019年3月6日
 */
public class Monthly implements Cloneable,Serializable {
	private static final long serialVersionUID = 8020128204161581044L;
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

	/**
	 * _如果你选择这种就不需要实现serizable接口
	 * @return
	 * @author sly
	 * @time 2019年3月6日
	 */
	public Monthly deepColne() {
		try {
			Object object = super.clone();
			Monthly monthly = (Monthly) object;
			Attachment attachment = monthly.getAttachment().clone();
			monthly.setAttachment(attachment);
			return monthly;
		} catch (CloneNotSupportedException e) {
			System.out.println(ExceptionUtils.getStackTrace(e));
		}
		return null;
	}
	
	/**
	 * _如果你选择这种就不需要实现Cloneable接口,里面的属性对象类也不需要实现Cloneable接口
	 * @return
	 * @throws Exception
	 * @author sly
	 * @time 2019年3月6日
	 */
	public Monthly deepCloneBySerizable() throws Exception {
		//将对象写入流中
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(this);
		//将对象取出来
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		return (Monthly)objectInputStream.readObject();
	}
}
