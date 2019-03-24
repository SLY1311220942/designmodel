package com.sly.designmodel.state;

/**
 * 状态B
 * @author sly
 * @time 2019年3月24日
 */
public class ConcreteStateB implements State {
	private static final String state = "B";
	
	@Override
	public void Handle(Context context) {
		context.setState(new ConcreteStateA());
	}

	@Override
	public String getStateStr() {
		return state;
	}

}
