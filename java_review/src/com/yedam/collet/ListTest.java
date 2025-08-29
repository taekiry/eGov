package com.yedam.collet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ListTest {
	@DisplayName("ListTest")
	@Test
	public void test1() {
		// List<String> list1 = new LinkedList<>(); // ArrayList와 차이점
		List<String> list = new ArrayList<>();

		list.add("사과");
		list.add("딸기");
		list.add("사과");
		list.add("포도");

		assertEquals(list.size(), 4);
	}

	@DisplayName("SetTest")
	@Test
	public void test2() {
		Set<String> list1 = new HashSet<>();

		list1.add("사과");
		list1.add("딸기");
		list1.add("사과");
		list1.add("포도");

		assertEquals(list1.size(), 3);
	}

	@DisplayName("MapTest")
	@Test
	public void test3() {

		Map<String, String> map = new HashMap<>();
		map.put("100", "홍길동");
		map.put("101", "김유신");

		map.get("100"); // 검색 속도 1 list를 쓰면 검색속도 n
	}

}
