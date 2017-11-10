package com.deepak.springSecurity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcomePage(Model model) {
		model.addAttribute("title", "This is welcome page");
		model.addAttribute("message", "All user can access this page");
		return "welcome";
	}

	@RequestMapping("/admin")
	public String adminPage(Model model) {
		model.addAttribute("title", "This is Admin page");
		model.addAttribute("message", "Admin can access this page");
		return "admin";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

}
