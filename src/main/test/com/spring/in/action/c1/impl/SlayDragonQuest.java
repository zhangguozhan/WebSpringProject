package com.spring.in.action.c1.impl;

import java.io.PrintStream;

import com.spring.in.action.c1.inter.Quest;


public class SlayDragonQuest implements Quest {
	
	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream) {
		// TODO Auto-generated constructor stub
		this.stream = stream;
	}

	@Override
	public void embark() {
		// TODO Auto-generated method stub
		stream.println("Embarking on quest to slay the dragon !");

	}

}
