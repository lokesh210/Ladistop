package io.Ladistop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LadistopController {
	
	@RequestMapping("/")
	public String showHome(Model model)
	{
		model.addAttribute("message", "Welcome to LadiStop");
		return "home";
		
	}

}
