package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.dto.UserInformation;
import com.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	public UserController() {
		System.out.println("Controller Class");
	}
	
	// It takes the request for the page and sends a page as a response.
	@RequestMapping("/RegistrationPage")
	public String userRegistrationPage()
	{
		System.out.println("UserRegistration Page");
		return "UserRegistration";
	}
	
	@RequestMapping("/LoginPage")
	public String userLoginPage()
	{
		System.out.println("UserLogin");
		return "UserLogin";
	}
	
	@RequestMapping("Registration")
	public String userRegistration(UserInformation userInformation)
	{
		System.out.println("Registration Successfull");
		System.out.println(userInformation);
		userService.userRegistration(userInformation);
		return "redirect:/LoginPage";
	}
	
	@RequestMapping("Login")
	public void userLogin(String Email, String Password)
	{
		userService.userLogin(Email, Password);
	}
}
