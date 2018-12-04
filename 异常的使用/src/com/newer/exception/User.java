package com.newer.exception;

public class User {
	
	// 年龄
	private int age;

	/**
	 * 设置年龄
	 * 在设置的过程中，可能输入了不匹配的数据，
	 * 这时就要抛出异常，作为提示信息。
	 * 
	 * @param age
	 * 
	 * 在运行过程中可能抛出的两种异常
	 * @throws TooYoungException
	 * @throws TooOldException
	 */
	public void setAge(int age) throws TooYoungException, TooOldException {
		if (age < 18)
			throw new TooYoungException("年龄太小");
		if (age > 60)
			throw new TooOldException("年龄太大");
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [age=" + age + "]";
	}
	
	

}
