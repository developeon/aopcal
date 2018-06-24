package kr.hs.emirim.developeon.aopcal.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.emirim.developeon.aopcal.cal.Calculator;
import kr.hs.emirim.developeon.aopcal.config.JavaConfig;

public class MainXmlAspect {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Calculator impCal = ctx.getBean("impCal",Calculator.class);
		long fiveFact1 = impCal.factorial(5);
		System.out.println("impCal.factorial(5) =" + fiveFact1);
		
		Calculator recCal = ctx.getBean("recCal",Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) =" + fiveFact2);
	}

}
