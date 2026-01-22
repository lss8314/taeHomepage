package com.example.demo.controller;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.JoinRequest;


@Controller
public class LoginController {
	
	private JoinRequest joinRequest;
	
	//로그 설정
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	  
	@GetMapping("/login")
	public String login(Model model) {
		log.info("로그인 으로 이동");
	    model.addAttribute("title", "로그인");
	    return "login"; // ★ layout 아님
	}

	  @GetMapping("/join")
	    public String join(Model model , JoinRequest param) {
		  
		
	        model.addAttribute("title", "회원가입");
	        return "join";
	  }
	  
	  @PostMapping("/join")
	  @ResponseBody
	  public ResponseEntity<?> join(@RequestBody JoinRequest param) {

		  
	      System.out.println("username = " + param.getUserName());
	      System.out.println("password = " + param.getPassWord());
	      System.out.println("name = " + param.getName());

	      return ResponseEntity.ok("OK");
	  }
	  
	 
}