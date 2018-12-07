package com.varHyeran.damoa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/test")
	public String home(Model model) {
		model.addAttribute("message", "hello world");
		System.out.println("hello phr!");
		return "test";
	}
	
}
