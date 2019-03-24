package com.sly.designmodel.state;

/**
 * 状态A
 * @author sly
 * @time 2019年3月24日
 */
public class ConcreteStateA implements State {
	private static final String state = "A";

	@Override
	public void Handle(Context context) {
		context.setState(new ConcreteStateB());

	}

	@Override
	public String getStateStr() {
		return state;
	}

}
