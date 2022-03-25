package com.codex.lang.java.basic;

import java.util.Scanner;

public class TaxCalculator {
	
	public static void main(String [] args){
		
		int taxable_income = 0;
		int total_income=0;
		int personal_rebate=0;
		int company_exmp=0;
		int tax = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("............. Welcome to ta calculator .............");
		System.out.println("Enter your details as below : ");
		System.out.println("Total income per year : ");
		total_income=in.nextInt();
		System.out.println("NSC/RD/Fixed-FD/PPF Amount: ");
		personal_rebate=in.nextInt();
		System.out.println("Company exsumptions : ");
		company_exmp=in.nextInt();
		
		taxable_income=(total_income-(personal_rebate+company_exmp));
		tax= taxable_income/10;
		System.out.println("Well your total taxable income is "+taxable_income+" and payable tax is "
				+tax+". Thank you for using tax calculator");
	}

}
