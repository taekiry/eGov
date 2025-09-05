package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.CustomerRepository;

@Controller
public class CustomerController {

   @Autowired CustomerRepository customerRepository;
   
   @GetMapping("list")
   public String list(Model model) {
      model.addAttribute("list", customerRepository.findAll());
      return "list";
   }
}
