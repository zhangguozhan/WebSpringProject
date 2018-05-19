package com.spring.in.action.c2.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.in.action.c2.inter.CompactDisc;

@Component
public class CDPlayer {
	
	private CompactDisc cd;
	

/*	
 * @Autowired���������ⷽ��������������ڷǹ�������������ô���ܴ��ڲ���@Autowired�Ĺ���������
 */
	
//	@Autowired
//	public CDPlayer(CompactDisc cd) {
//		this.cd = cd;
//	}
	
	public void play() {
		cd.play();
	}
	
	@Autowired
	public void insertCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
}
