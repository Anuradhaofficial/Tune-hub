package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller; 

@Controller
public class Navcontroller{
	@GetMapping("/login")
	public String login() {
		return "login";
		
	}

	@GetMapping ("/registration")
	public String registration() {
		return "registration";
		
	}
	@GetMapping("/newSong")
	public String newSong() {
		return "newSong";
	}
}





