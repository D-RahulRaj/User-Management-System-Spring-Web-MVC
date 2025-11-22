package com.user.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/* @ComponentAdvice is the combination of @Compoonent
 * It is used it specify that the class is Global Exception Hanndler, Nothing but the class is used to handle
 * the exceptions which are generated in the application and also used to create the bean fir Global Exception 
 * Handler Class. 
 */
@ControllerAdvice
public class UserExceptionHandler {
/* @ExceptionHandler is th emethod level annotation
 *  it is used to specify which class exception should be handled.
 */

/* @ResponseBody is used to convert the java object into JSON object.
 * It is also used to print the values on the web page
*/
//	@ResponseBody
	@ExceptionHandler(UserDataInvalidException.class)
	public String userInvalidExceptionHandler(UserDataInvalidException exception, Model model) {
		String exceptionMsg = exception.getExceptionMessage();
		model.addAttribute("exceptionMsg", exceptionMsg);
		return "UserRegistration";
	}
	
	@ExceptionHandler(UserLoginDetailsException.class)
	public String userInvalidExceptionHandler(UserLoginDetailsException exception, Model model) {
		String exceptionMsg = exception.getExceptionMessage();
		model.addAttribute("exceptionMsg", exceptionMsg);
		return "UserLogin";
	}
}
