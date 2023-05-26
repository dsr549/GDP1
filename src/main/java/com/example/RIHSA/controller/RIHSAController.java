package com.example.RIHSA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RIHSAController {
	
	@RequestMapping("home")
	public String home() {
		return "index.html";
	}
	
	@RequestMapping("announcements")
	public String goToAnnouncements() {
		return "announcements.html";
	}
	
	@RequestMapping("details")
	public String goToDetails() {
		return "details.html";
	}
	
	@RequestMapping("maps")
	public String goToMaps() {
		return "map.html";
	}
	@RequestMapping("contacts")
	public String goToContacts() {
		return "contact.html";
	}
	@RequestMapping("gallery")
	public String goToGallery() {
		return "gallery.html";
	}
	@RequestMapping("login")
	public String goToLogin() {
		return "login.html";
	}
	@RequestMapping("signup")
	public String goToSignUp() {
		return "Signup.html";
	}

}
