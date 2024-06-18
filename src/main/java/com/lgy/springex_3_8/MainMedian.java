package com.lgy.springex_3_8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainMedian {
	public static void main(String[] args) {
		String configLoc="classpath:medianCTX.xml";
		AbstractApplicationContext ctx= new GenericXmlApplicationContext(configLoc);
		MyMedian median=ctx.getBean("myMedian",MyMedian.class);
		
		median.pc();
	}
}
