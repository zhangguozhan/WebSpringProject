package com.spring.in.action.c4.impl;

import org.springframework.stereotype.Component;

import com.spring.in.action.c4.inter.Performance;

@Component("musicPerform")
public class MusicPerformance implements Performance{

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("啊 啊啊啊  啊啊啊啊啊啊啊 啊啊啊啊啊                      。。。。。。。。。。。。。。。。");
	}

}
