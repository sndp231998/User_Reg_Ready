package com.user.playloads;

import lombok.Data;

@Data
public class JwtAuthRequest {
private String username;
	
private String password;
}
