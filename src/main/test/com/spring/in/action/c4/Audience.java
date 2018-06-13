package com.spring.in.action.c4;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 *  @Aspect标注Audience为一个切面。
 *  @Before @AfterReturning等声明通知
 *  execution(......)定义切点
 *
 */
@Aspect
@Component
public class Audience {
	
	public Audience() {
		System.out.println("Audience create !");
	}
	
	/**
	 * 定义命名的切点
	 */
	@Pointcut("execution(** com.spring.in.action.c4.inter.Performance.perform(..))")
	public void performce(){}
	
	@Before("execution(** com.spring.in.action.c4.inter.Performance.perform(..))")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones ");
	}
	
	@Before("performce()")
	public void takeSeats() {
		System.out.println("Taking seates ");
	}
	
	@AfterReturning("performce()")
	public void applause() {
		System.out.println("CLAP CLAP CLAP ");
	}
	
	@AfterThrowing("performce()")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
	
	
}
