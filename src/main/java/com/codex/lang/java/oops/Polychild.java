package com.codex.lang.java.oops;

/**
 * 
	1) Can we change return type while overriding ? No but java support covarient return type so we can change the return type if the returntype
		 is subClass of any Class(which is geeting used in parent class as returntype).
	2) Can we change access identifire while overriding ? We can change from protected(Parent) to public in child 
		 but can't do any changes in case of private. Also we can't change from public in parent to protected in child-CompileTime Exception
	3) Overloading with int-float and float-int param then which method would be called if we pass 1,1. Compile Time Exception
	4) Can we change return type while overloading ? Yes We Can but we have to do some changes to arguments also

 * @author anutiwar
 *
 */
public class Polychild extends Polyparent {
	public static void main(String[] args) {
		Polychild child = new Polychild();
		child.show(1, (long)1);
		//child.show(1, 1); // compile time exception
		
		PolyDemoParent P1 = new PolyDemoChild();
		P1.publish();
		PolyDemoChild P2 = (PolyDemoChild)new PolyDemoParent();
		P2.publish(); // RunTimeException Classcast Exception as the child can not cast to parent
		// PolyDemoChild P3 = new PolyDemoParent(); // compile time exception as the child can not cast to parent
	}

	@Override
	public Polychild poly() {		
		return (Polychild) new Polyparent();
	}
	// We can't change the return type while Overriding
	@Override
	public int display(int a, int b) {
		return 0;
	}

	public int show(int A, long B) {
		return 0;
	}

	public long show(long A, int B) {
		return 0;
	}
	
	public long brief(long A, int B) {
		return 0;
	}
	public int brief(int A, int B) {
		return 0;
	}

}
