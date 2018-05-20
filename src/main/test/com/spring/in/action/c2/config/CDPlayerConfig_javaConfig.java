package com.spring.in.action.c2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.in.action.c2.impl.CDPlayer;
import com.spring.in.action.c2.impl.SgtPeppers;
import com.spring.in.action.c2.inter.CompactDisc;

@Configuration
public class CDPlayerConfig_javaConfig {
	
	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}

}
