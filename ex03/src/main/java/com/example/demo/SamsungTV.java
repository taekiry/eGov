package com.example.demo;

import java.util.Date;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import lombok.Setter;

@Component
@Scope("singleton") // 잘안씀 특별한경우;
@Lazy // 지연로딩 잘안씀.
//@RequiredArgsConstructor
public class SamsungTV implements TV  {

//	@Setter(onMethod_ = {@Autowired} ) // 해당 필드위에 넣으면 하나만 만들어줌;
	Speaker speaker;
	// final 붙이고 requiredArgs 하면 final만 생성자 생성가능.
	
	Date date; 

	@Override
	public void powerOn() {
		System.out.println("삼성 TV--전원 on");
	}

	@Override
	public void powerOff() {
		System.out.println("삼성 TV--전원 off");
	}

	@Override
	public void volumeUp() {
//		System.out.println("삼성 TV--볼륨 up");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
//		System.out.println("삼성 TV--볼륨 down");
		speaker.volumeDown();
	}
}