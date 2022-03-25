package com.codex.lang.java.basic;

public abstract class AbstractStatic {
	
	public static void calculate1(){		
		System.out.println("Yu1");
	}
	
	static void calculate2(){		
		System.out.println("Yu2");
	}

	final void calculate3(){		
		System.out.println("Yu3");
	}

	final static void calculate4(){		
		System.out.println("Yu4");
	}
	private static void calculate5(){		
		System.out.println("Yu5");
	}
	public final void calculate6(){		
		System.out.println("Yu6");
	}

}


