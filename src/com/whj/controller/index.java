package com.whj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index.do")
public class index {
	@RequestMapping()
	public String index(){
		return "test/index";
	}
}
