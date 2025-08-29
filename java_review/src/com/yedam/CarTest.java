package com.yedam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
	@DisplayName("객체생성")
	@Test
	public void test2() {

		Car car1 = new Car("쏘렌토");
		Car car2 = new Car("벤츠");

		assertEquals(car1, car2);
	}

	@DisplayName("싱글톤")
	@Test
	public void test() {

		Car car1 = Car.getInstance("쏘렌토");
		Car car2 = Car.getInstance("벤츠");

		assertEquals(car1, car2);
	}

	@DisplayName("private 캡슐화")
	@Test
	public void test3() {
		Car car1 = new Car("벤츠");
		car1.setModel("테슬라");

		String model = car1.getModel();
		System.out.println(model);
	}
}
