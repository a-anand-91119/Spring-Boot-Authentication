package com.anand.example.springauthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anand.example.springauthentication.constants.AppConstants;

@RestController
public class Controller {
	
	@GetMapping(AppConstants.URL_ROOT)
	public String home() {
		return ("<h1>WELCOME</h1>"); 
	}

	@GetMapping(AppConstants.URL_USER)
	public String user() {
		return ("<h1>USER</h1>");
	}

	@GetMapping(AppConstants.URL_ADMIN)
	public String admin() {
		return ("<h1>ADMIN</h1>");
	}
}
