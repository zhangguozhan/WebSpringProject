package com.spring.in.action.c2.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.in.action.c2.config.CDPlayerConfig;
//import com.spring.in.action.c2.config.CDPlayerConfig_javaConfig;
import com.spring.in.action.c2.impl.CDPlayer;

public class MainCDPlay {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig_javaConfig.class);
		ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		CDPlayer cdPlayer = (CDPlayer) context.getBean("hello world");
//		CDPlayer cdPlayer = context.getBean(CDPlayer.class);
		cdPlayer.play();
	}

}
