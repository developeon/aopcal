package kr.hs.emirim.developeon.aopcal.main;

import kr.hs.emirim.developeon.aopcal.cal.ExeTimeCalculator;
import kr.hs.emirim.developeon.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.developeon.aopcal.cal.RecCalculator;

public class MainProxy {

	public static void main(String[] args) {
		int num = 20;
		
		ExeTimeCalculator ttcal1 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(ttcal1.factorial(num));
		
		ExeTimeCalculator ttcal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttcal2.factorial(num));
		
		
		
	}

}
