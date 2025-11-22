package com.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInformation {
	
	private String userName;
	private String userEmail;
	private long MobileNumber;
	private String userPassword;
	private String userGender;
	private String userAddress;
	
}
