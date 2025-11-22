package com.user.service;

import org.springframework.stereotype.Service;

import com.user.dto.UserInformation;
import com.user.exception.UserDataInvalidException;
import com.user.exception.UserLoginDetailsException;

// @Service Annotation is the combination of @Component
// It is user to specify that class is a service 
// Which is used to write the business logic code and
// Also used to create the bean for the service classes
@Service
public class UserService {

	public void userRegistration(UserInformation userInformation) {
		if (userInformation.getUserEmail().contains("@gmail.com")) {
			
		} else {
			throw new UserDataInvalidException("Invalid Email Id");
		}
		
		if (userInformation.getMobileNumber()>=6999999999l && userInformation.getMobileNumber()<=9999999999l) {
			
		} else {
			throw new UserDataInvalidException("Invalid Mobile Number");
		}
	}
	
	public boolean userLogin(String emailId,String Password) {
		if(emailId.equalsIgnoreCase("rahul@gmail.com")&&Password.equals("Rahul_2004"))	{
			return true;
		} else {
			throw new UserLoginDetailsException("Invalid Email Or Password");
		}
	}
}
