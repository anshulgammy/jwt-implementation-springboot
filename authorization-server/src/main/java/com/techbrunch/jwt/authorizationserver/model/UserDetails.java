package com.techbrunch.jwt.authorizationserver.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserDetails {
	@Value("${authorization.username}")
	private String username;
	@Value("${authorization.password}")
	private String password;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public UserDetails() {

	}
}
