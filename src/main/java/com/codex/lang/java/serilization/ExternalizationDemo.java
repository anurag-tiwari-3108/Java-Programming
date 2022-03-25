package com.codex.lang.java.serilization;

import java.io.IOException;

public class ExternalizationDemo {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		Externalization ext = new Externalization(10001, "Anurag", "anurag@1",1010);
		SerilizationUtil.serilize(ext);
		SerilizationUtil.deserilize(ext);
	}
}
