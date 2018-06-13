package com.spring.in.action.c4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.in.action.c4.inter.Performance;

public class MainPerform {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
//		Performance perform = context.getBean(Performance.class);
//		Performance perform = (Performance) context.getBean("throwPerform");
		Performance perform = (Performance) context.getBean("musicPerform");
		perform.perform();
		perform.dunce("hello world !");

	}

}
