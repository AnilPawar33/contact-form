package com.contactForm.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {

//	It's 
	@PostMapping("/contact")
	public String handleContact(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam String message){
		System.out.println( "Name : " + name + ", Email : " + email + ", Message : " + message);
	
		return "Form submitted successfully";
	
	}
}
