package com.spring.in.action.c1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.in.action.c1.inter.Knight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file/spring/knights.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springInAction/c1/knights.xml");
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();
//		Quest quest = context.getBean(Quest.class);
//		quest.embark();
		context.close();
	}

}
