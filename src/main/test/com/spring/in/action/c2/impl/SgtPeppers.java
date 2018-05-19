package com.spring.in.action.c2.impl;

import org.springframework.stereotype.Component;

import com.spring.in.action.c2.inter.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc {
	
	private String title = "Sgt. Peper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+title+ "by"+ artist);

	}

}
