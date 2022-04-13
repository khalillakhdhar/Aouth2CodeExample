package com.demo.ressource;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestResource 
{
	@RequestMapping("/api/users/me")
	public ResponseEntity<UserProfile> profile() 
	{
		//Build some dummy data to return for testing
		
		String email = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString() + "@gmail.com";

		UserProfile profile = new UserProfile();
		profile.setName("connected");
		profile.setEmail("connectedUser");

		return ResponseEntity.ok(profile);
	}
}
