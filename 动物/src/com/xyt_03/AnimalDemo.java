package com.xyt_03;

import com.xyt_02.Animal;
import com.xyt_02.Dog;
import com.xyt_02.Tiger;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Animal a = new Dog();
		a.sleep();
		a.eat();
		Dog dog = (Dog) a;
		dog.jump();
		System.out.println("--------");
		Animal animal=new Tiger();
		Tiger tiger=(Tiger) animal;
		tiger.eat();
		tiger.sleep();
		tiger.jump();
		tiger.swim();
	}

}
