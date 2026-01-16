package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "홈");
        
        return "index";
    }
    
	@GetMapping("/join")
	public String join(Model model) {
		log.info("회원가입");
	    model.addAttribute("title", "회원가입");
	    return "join"; // ★ layout 아님
	}
}