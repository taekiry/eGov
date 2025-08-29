package com.yedam;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Score {
	public void input() throws Exception {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = total(n1, n2);
		System.out.println("result = " + n3);

	}

	public int total(int n1, int n2) throws Exception {
		if (n1 < 0 || n2 < 0) {
			throw new Exception("음수 입력 감지");

		}
		int result = n1 + n2;
		return result;

	}
};

public class ExceptionTest {

	@Test
	public void test() {
		// 객체 생성
		Score scr = new Score();

		// input 메서드 호출(실행)
		try {
			scr.input();
			// throws로 던진 예외 catch
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
