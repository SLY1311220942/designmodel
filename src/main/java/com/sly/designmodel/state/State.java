package com.sly.designmodel.state;

/**
 * 抽象状态类,定义一个接口以封装与Context的一个特定状态相关的行为
 * 
 * @author sly
 * @time 2019年3月24日
 */
public interface State {
	public void Handle(Context context);

	public String getStateStr();
}
