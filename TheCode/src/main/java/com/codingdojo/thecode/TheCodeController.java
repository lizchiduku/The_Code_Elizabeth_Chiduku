package com.codingdojo.thecode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class TheCodeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/getSecretCode", method=RequestMethod.POST)
	public String getSecretCode(@RequestParam(value="textinput") String userInput) {
		String result ="";
		if(userInput.equals("bushido")) {
			result= "redirect:/code";
		}else {
			result = "redirect:/createError";
		}
		return result;
	}
	@RequestMapping("/code")
	public String displaycode(){
		return "code.jsp";
	}
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttrbutes) {
		redirectAttrbutes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}

}