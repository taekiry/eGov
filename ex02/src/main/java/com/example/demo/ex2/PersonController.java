package com.example.demo.ex2;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.ex1.PersonForm;

import jakarta.validation.Valid;


@Controller
public class PersonController {

	
	@GetMapping("/person")
	public String showForm(PersonForm personForm) {
		return "form";
	}

	@PostMapping("/person")
	public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "form";
		}

		return "redirect:/api/sample";
	}
}
