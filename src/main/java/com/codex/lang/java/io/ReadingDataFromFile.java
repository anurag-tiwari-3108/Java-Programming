package com.codex.lang.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromFile {

	public static void main(String[] args) {
		BufferedReader read = null;
		String aCurrentLine = null;
		String readFile = "C:\\Users\\Anurag\\Desktop\\Anurag_Tiwari_Java_2_years.docx";
		try {
			System.out.println("Going to read the file " + readFile + "\n");
			read = new BufferedReader(new FileReader(readFile));

			while ((aCurrentLine = read.readLine()) != null) {
				System.out.println("Reading the file :: " + aCurrentLine);

			}
		} catch (FileNotFoundException e) {
			System.out.println("Oops !! Caught Exception " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (read != null)
					read.close();
			} catch (IOException ex) {
				System.out.println("Caught new Exception " + ex.getCause());
				ex.printStackTrace();
			}
		}

	}
}
