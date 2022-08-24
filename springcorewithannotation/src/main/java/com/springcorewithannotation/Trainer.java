package com.springcorewithannotation;

import org.springframework.stereotype.Component;

@Component("a1")
public class Trainer implements TrainerInterface{
	public void teach() {
		System.out.println("Trainer is teaching");
	}
}
