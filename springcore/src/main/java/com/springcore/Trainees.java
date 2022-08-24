package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Trainees {
	
	
	private TrainerInterface tt;
	
	//place on the container
	public void setTt(TrainerInterface tt) {
		this.tt = tt;
	}

	public void useTrainer() {
		tt.teach();
	}

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("abc.xml");
				
		Trainees t1=(Trainees)ctx.getBean("b1");
		
		//spring BeanFactory task start
		
		//TrainerInterface t2=new Trainer();
		//t1.setTt(t2);   //dependency injection
		
		//spring BeanFactory task end
		
		t1.useTrainer();

	}

}
