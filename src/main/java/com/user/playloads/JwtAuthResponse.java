package com.user.playloads;

import lombok.Data;

@Data
public class JwtAuthResponse {

	
private String token;
	
	private UserDto user;
}
