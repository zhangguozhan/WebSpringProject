package com.spring.in.action.c4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {
	
	@Bean
	public Audience audience(){
		System.out.println("ConcertConfig.audience ......"); //Audience类添加@Component则不会走到这里。
		return new Audience();
	}
}
