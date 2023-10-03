package com.sinensia.pollosfelices.backend.presentation.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/home")
public class AppHomeController {

	@GetMapping
	public String getHome(){
		return "home";
	}
	
}
