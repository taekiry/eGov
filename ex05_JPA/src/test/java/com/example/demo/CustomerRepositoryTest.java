package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired
	CustomerRepository customerRepository;

//	@Test
	public void list() {
		List<Customer> list = customerRepository.findAll();
		list.forEach(System.out::println);
	}

//	@Test
	public void get() {
		Customer customer = customerRepository.findById(1L).get();
		System.out.println(customer);
	}

//	@Test
	public void delete() {
		// 단건조회
		Customer customer = customerRepository.findById(1L).get();
		// 삭제
		customerRepository.delete(customer);

		// 다시 조회
		System.out.println(customer);
	}

//	@Test
	public void insert() {
		Customer customer = new Customer("kim", "010-2222-3333");
		customerRepository.save(customer);
		customerRepository.findAll().forEach(System.out::println);
	}

//	@Test
	public void update() {

		// 단건 조회
		Customer customer = customerRepository.findById(1L).get();
		// 이름 변경
		customer.setName("ggang");
		// save
		customerRepository.save(customer);
		// 단건 조회 결과출력
		System.out.println(customer);
	}

//	@Test
	public void search() {
		customerRepository.findByNameLike("%i%").forEach(System.out::println);

	}

	@Test
	public void findPhone() {
		customerRepository.findByPhone("1").forEach(System.out::println);
	}
}
