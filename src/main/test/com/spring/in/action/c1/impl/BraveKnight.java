package com.spring.in.action.c1.impl;

import com.spring.in.action.c1.inter.Knight;
import com.spring.in.action.c1.inter.Quest;

public class BraveKnight implements Knight {
	
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		// TODO Auto-generated constructor stub
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		quest.embark();
	}

}
