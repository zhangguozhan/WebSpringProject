package com.spring.in.action.c2.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.in.action.c2.config.CDPlayerConfig;
import com.spring.in.action.c2.impl.CDPlayer;

public class MainCDPlay {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
//		CDPlayer cdPlayer = context.getBean(CDPlayer.class);
		CDPlayer cdPlayer = (CDPlayer) context.getBean("hello world");
		cdPlayer.play();
	}

}
