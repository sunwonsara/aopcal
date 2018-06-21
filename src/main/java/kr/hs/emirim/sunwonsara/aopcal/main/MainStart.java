package kr.hs.emirim.sunwonsara.aopcal.main;

import kr.hs.emirim.sunwonsara.aopcal.cal.Calculator;
import kr.hs.emirim.sunwonsara.aopcal.cal.ImpCalculator;
import kr.hs.emirim.sunwonsara.aopcal.cal.RecCalculator;

public class MainStart {

	public static void main(String[] args) {
		Calculator cal1=new ImpCalculator();
		long f1=cal1.factorial(100);
		System.out.println("Imp 4 : "+f1);
		
		Calculator cal2=new RecCalculator();
		long f2=cal2.factorial(100);
		System.out.println("Rec 4 : "+f2);
		

	}

}
