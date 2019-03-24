package com.sly.designmodel.state;

/**
 * 维护一个ContextState子类的实例,这个实例定义当前状态
 * 
 * @author sly
 * @time 2019年3月24日
 */
public class Context {
	private State state;

	public Context() {
	}

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println("当前状态:" + state.getStateStr());
	}

	public void request() {
		state.Handle(this);
	}
}
