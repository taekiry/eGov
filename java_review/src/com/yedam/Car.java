package com.yedam;

/* 
 * 클래스 = 설계도, 속성(필드) + 행위(메서드)
 * 
 * 1. 클래스 선언
 * 2. 객체(인스턴스) 생성 = 메모리 영역 할당
 * 3. 객체 사용
 * 
 * */

public class Car {
	
	
	//String model;
	private String model;
	
	
/// getter setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	// 1. 자기 자신을 저장할 정적 변수
	private static Car instance;

	
	// 이클립스 생성자 만들기
	// 생성자 : 객체 생성시 호출되는 메서드, 필드 초기화 역할
	// 2. private 생성자 (외부에서 new 금지)
	public Car(String model) {
		this.model = model;
	}

	// 3. 유일한 객체 반환 (필요할 때 생성) 싱글톤. 재활용가능 instance가 있으면 instance 없으면 생성
	public static Car getInstance(String model) {
		if (instance == null) {
			instance = new Car(model);
		}
		return instance;
	}


	public void drive() {
		System.out.println(model + " 운행");
	}
	
	
}
