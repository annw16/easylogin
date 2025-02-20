package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/helloworld1")
public class IndexController {

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Hello World";
	}
}
