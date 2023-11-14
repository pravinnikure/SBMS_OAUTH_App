package com.app.pravin.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRestController 
{
	
	@GetMapping("/secure")
	public String securePage()
	{
		return "secure";
	}


	@GetMapping("/index")
	public String showIndex()
	{
		return "index";
	}

	@GetMapping("/hello")
	@ResponseBody
	public String showHello()
	{
		return "Hello from controlloer";
	}
	
	@GetMapping("/secureData")
	@ResponseBody
	public Principal secureData(Principal p)
	{
		System.out.println(p.getClass().getName());
		System.out.println(p);
		return p;
	}

}
