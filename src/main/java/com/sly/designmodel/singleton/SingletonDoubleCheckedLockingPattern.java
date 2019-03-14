package com.sly.designmodel.singleton;

/**
 * 
 * @author sly
 * @time 2019年3月4日
 */
public class SingletonDoubleCheckedLockingPattern {
	private volatile static SingletonDoubleCheckedLockingPattern instance;

	private SingletonDoubleCheckedLockingPattern() {
	}
	
	/**
	 * 双重检验锁模式（double checked locking pattern），是一种使用同步块加锁的方法。
	 * 程序员称其为双重检查锁，因为会有两次检查 instance == null，一次是在同步块外，一
	 * 次是在同步块内。为什么在同步块内还要再检验一次？因为可能会有多个线程一起进入同步
	 * 块外的 if，如果在同步块内不进行二次检验的话就会生成多个实例了。
	 * @return
	 * @author sly
	 * @time 2019年3月4日
	 */
	public static SingletonDoubleCheckedLockingPattern getInstance() {
		//Single Checked
	    if (instance == null) {                         
	        synchronized (SingletonDoubleCheckedLockingPattern.class) {
	        	//Double Checked
	            if (instance == null) {                 
	                instance = new SingletonDoubleCheckedLockingPattern();
	            }
	        }
	    }
	    return instance ;
	}

	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
