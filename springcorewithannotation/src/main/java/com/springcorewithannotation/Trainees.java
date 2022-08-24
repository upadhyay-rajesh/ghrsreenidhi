package com.springcorewithannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component("b1")
public class Trainees {
	
	@Autowired
	@Qualifier("a2")
	private TrainerInterface tt;
	
	
	public void useTrainer() {
		tt.teach();
	}

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("abc.xml");
				
		Trainees t1=(Trainees)ctx.getBean("b1");
		
		t1.useTrainer();

	}

}
