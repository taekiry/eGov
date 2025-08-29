package com.yedam.inter;

import org.junit.jupiter.api.Test;
/*
 * 다형성
 * 부모타입의 참조변수가 자식객체 참조
 */
public class AnimalTest {
	@Test
	public void test() {
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		
//		cat.sound();
//		dog.sound();
		
	Animal animal = new Dog();
	animal.sound();
	}
}
