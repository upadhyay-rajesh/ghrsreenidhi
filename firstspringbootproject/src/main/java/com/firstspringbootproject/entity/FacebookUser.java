package com.firstspringbootproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
public class FacebookUser {
	
	private String name;
	private String password;
	
	@Id
	private String email;
	private String address;
	
	
}
