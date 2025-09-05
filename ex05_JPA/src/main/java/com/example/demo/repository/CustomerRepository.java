package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	// long 이 아니라 Long으로 작성. ex) int => Integer 같이 primitive형식 사용못함
	 public List<Customer> findByName(String name); 
	 
	@Query("select u from Customer u where u.phone like %?1% order by name desc")
	 public List<Customer> findByPhone(String phone); //like검색도 가능
	
	
	public List<Customer> findByNameLike(String keyword);
}