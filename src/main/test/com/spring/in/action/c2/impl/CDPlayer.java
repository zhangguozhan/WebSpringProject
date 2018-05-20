package com.spring.in.action.c2.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.in.action.c2.inter.CompactDisc;

@Component
public class CDPlayer {
	
	private CompactDisc cd;
	

/*	
 * @Autowired可以在任意方法，但是如果放在非构造器方法，那么不能存在不带@Autowired的构造器方法
 */
	
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
	
	@Autowired
	public void insertCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
}
