/**
 * 
 */
package com.xyt_02;

import com.xyt_01.Jump;
import com.xyt_01.Swim;

/**
 * @author xuyouting
 *
 */
public class Tiger extends Animal implements Jump, Swim {

	/* （非 Javadoc）
	 * @see com.xyt_01.Swim#swim()
	 */
	@Override
	public void swim() {
		// TODO 自动生成的方法存根
		System.out.println("老虎会游泳");
	}

	/* （非 Javadoc）
	 * @see com.xyt_01.Jump#jump()
	 */
	@Override
	public void jump() {
		// TODO 自动生成的方法存根
		System.out.println("老虎会跳");
	}

	/* （非 Javadoc）
	 * @see com.xyt_02.Animal#eat()
	 */
	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("老虎也吃肉");
	}

	/* （非 Javadoc）
	 * @see com.xyt_02.Animal#sleep()
	 */
	@Override
	public void sleep() {
		// TODO 自动生成的方法存根
		System.out.println("老虎爱睡觉");
	}

}
