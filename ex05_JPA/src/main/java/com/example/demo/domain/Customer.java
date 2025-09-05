package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import   lombok.Data;

@Data
@Entity
public class Customer {
   
   public Customer() {}
   
   public Customer( String name, String phone) {
      super();
      this.name = name;
      this.phone = phone;
   }

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   
   @Column(length = 20, nullable = false)
   private String name;
   
   @Column(length = 20, nullable = false, unique = true)
   private String phone;
}