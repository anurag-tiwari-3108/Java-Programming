package com.codex.lang.java.basic;

public class BeforeCurrentDate {
	
	
	public static void main(String[] args) {
		
		BeforeCurrentDate obj = new BeforeCurrentDate();
		System.out.println("Output is "+obj.process(3,1));
	}
	
	public int process(int days, int holidays){
		
		int sum ;
		if(days <4){
			sum = (days-1)/2;
			}
		else {
			sum = (days+1)/2;
		}
		for (int i =0; i<days; i++){
			for(int j = 0; j < 3; j++){
				for (int k = 0; k < holidays; k++){
					sum++;
					System.out.println(i+"  "+j+"  "+k + "  sum "+sum);
				}
			}
		}
		
		return sum;
	}
}