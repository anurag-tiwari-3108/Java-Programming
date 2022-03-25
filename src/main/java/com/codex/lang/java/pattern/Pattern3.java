package com.codex.lang.java.pattern;

import java.util.Scanner;

/**
 * 
 * 			*****
 * 			 ***
 * 			  *
 * 
 *
 */
public class Pattern3 {
	
	public static void main(String [] args){
		
		System.out.println("Enter the no of line you want to print : ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
           for(int m=num;m>=i;m--)
            {
               System.out.print(" *"); 
            }
             System.out.print("\n");
        }    
		
	}	
}
