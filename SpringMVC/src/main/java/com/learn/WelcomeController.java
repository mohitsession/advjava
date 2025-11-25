package com.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/welcome")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("welcomePage");
		modelAndView.addObject("message", "Ram");
		return modelAndView;
	}
	

	@RequestMapping(value = "/showUserName", method = RequestMethod.GET)
	public ModelAndView queryParameter(@RequestParam(name = "username", required = false, defaultValue = "User") String username) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("welcomePage");
		modelAndView.addObject("message", username);
		return modelAndView;
	}
	
}
