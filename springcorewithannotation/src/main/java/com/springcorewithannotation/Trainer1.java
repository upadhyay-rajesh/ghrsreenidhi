package com.springcorewithannotation;

import org.springframework.stereotype.Component;

@Component("a2")
public class Trainer1 implements TrainerInterface{

	public void teach() {
		System.out.println("trainer 1 is teaching");
		
	}

}
