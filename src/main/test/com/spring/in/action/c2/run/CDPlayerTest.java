package com.spring.in.action.c2.run;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.in.action.c2.config.CDPlayerConfig;
import com.spring.in.action.c2.impl.CDPlayer;
import com.spring.in.action.c2.inter.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void cdSouldNotBeNull() {
		try{
			assertNotNull(cd); //为空抛出错误
			cd.play();
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}
	
	@Test
	public void cdPlayTest() {
		cdPlayer.play();
	}
	
	

}
