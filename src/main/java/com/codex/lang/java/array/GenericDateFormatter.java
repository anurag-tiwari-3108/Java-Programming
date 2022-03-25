package com.codex.lang.java.array;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenericDateFormatter {
	public static final String cName = GenericDateFormatter.class.getName()+" :: ";
	public static void main(String[] args) {
		System.out.println(cName+ "Formatted Date for the input date 1524155201186 is  "+getGenericDateFormatted("1524155201186"));
	}

	private static String getGenericDateFormatted(String date) {
		long longDate = Long.parseLong(date);
		Date dateObj = new Date(longDate);
		DateFormat formatter = new SimpleDateFormat("dd-MMM-yy hh:mm:ss a");
		return formatter.format(dateObj);
	}
}
