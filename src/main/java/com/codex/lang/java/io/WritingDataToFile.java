package com.codex.lang.java.io;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WritingDataToFile {
	
	private static String cName="WritingDataToFile";

	public WritingDataToFile(int number) {
	}

	DateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd");
	Date date = new Date();
	{
		String formatedDate = dateFormat.format(date);

		try {
			FileWriter file = new FileWriter("C:\\Users\\Anurag\\"+cName+"_"+formatedDate + ".log");
			PrintWriter pw = new PrintWriter(file);
			for (int i = 0; i>=20; i++){
			pw.printf("Number of Line : "+i+" :: Class Name : "+cName+":: Authod Name :Anurag Tiwari");
			
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
}