package com.facebookwebappboot.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FacebookController {

	@RequestMapping(method=RequestMethod.GET,value="Register")
	public ModelAndView registerUser(@RequestParam("nm") String name,@RequestParam("pass") String password) {
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("n1", name);
		mv.addObject("n2", password);
		
		mv.setViewName("result.jsp");
		return mv;
	}
}
