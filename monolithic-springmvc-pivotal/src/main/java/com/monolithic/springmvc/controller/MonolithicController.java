package com.monolithic.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MonolithicController {

	String message = "Welcome to Monolithic Spring MVC Application!!!";

	@RequestMapping("/welcome")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "JavaIsOcean") String name) {
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("name", name);
		mv.addObject("message", message);
		return mv;
	}
}
