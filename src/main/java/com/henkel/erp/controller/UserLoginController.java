package com.henkel.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.henkel.erp.user.model.UserDetails;
import com.henkel.erp.user.services.UserLoginService;

@RestController
@RequestMapping("/user")
public class UserLoginController {
	
	
	@Autowired
	public UserLoginService userLoginService;
	
	
	@RequestMapping(value="/validateUserByEmail",method=RequestMethod.GET)
	public ResponseEntity<UserDetails> validateUserByEmail(@RequestParam String emailId){
		UserDetails userDetails=userLoginService.validateUserByEmailId(emailId);
		return new ResponseEntity<UserDetails>(userDetails,HttpStatus.OK);
		
	}

}
