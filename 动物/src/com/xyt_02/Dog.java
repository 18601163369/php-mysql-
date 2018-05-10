/**
 * 
 */
package com.xyt_02;

import com.xyt_01.Jump;

/**这是狗的具体类
 * @author xuyouting
 * @version 1.0
 */
public class Dog extends Animal implements Jump {

	/*
	 * （非 Javadoc）
	 * 
	 * @see com.xyt_01.Jump#jump()
	 */
	@Override
	public void jump() {
		// TODO 自动生成的方法存根
		System.out.println("会跳高的狗");
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see com.xyt_02.Animal#eat()
	 */
	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("狗吃肉");

	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see com.xyt_02.Animal#sleep()
	 */
	@Override
	public void sleep() {
		// TODO 自动生成的方法存根
		System.out.println("狗在院子里睡觉");

	}

}
