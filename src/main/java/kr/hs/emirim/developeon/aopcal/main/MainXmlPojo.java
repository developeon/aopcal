package kr.hs.emirim.developeon.aopcal.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.emirim.developeon.aopcal.cal.Calculator;

public class MainXmlPojo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:aopPojo.xml");
		
		Calculator impCal = ctx.getBean("impCal", Calculator.class);
		long finveFact1 = impCal.factorial(5);
		System.out.println("impcal.factorial(5) = " + finveFact1);
		
		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long finveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + finveFact2);
	}

}
