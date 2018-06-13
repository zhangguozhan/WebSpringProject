package com.spring.in.action.c4.impl;

import org.springframework.stereotype.Component;

import com.spring.in.action.c4.inter.Performance;

@Component("throwPerform")
public class ThrowPerformance implements Performance{

	@Override
	public void perform() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void dunce(String name) {
		// TODO Auto-generated method stub
		System.out.println("ThrowPerformance--"+name);
	}

}
