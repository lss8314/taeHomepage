package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
	
	//로그 설정
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	  
	@GetMapping("/login")
	public String login(Model model) {
		log.info("로그인 으로 이동");
	    model.addAttribute("title", "로그인");
	    return "login"; // ★ layout 아님
	}

	  @GetMapping("/join")
	    public String join(Model model) {
		  log.info("회원가입으로 이동!");
	        model.addAttribute("title", "회원가입");
	        return "join";
	    }
	
}