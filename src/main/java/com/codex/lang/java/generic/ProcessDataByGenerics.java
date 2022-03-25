package com.codex.lang.java.generic;

public class ProcessDataByGenerics {

	public static void main(String a[]) {

	//	ProcessGeneric<Integer> sgb = new ProcessGeneric<Integer>(1);
	//s	sgb.returnGenericValue(1, 1);

	}

	class ProcessGeneric<T extends Number> {

	    private T objReff = null;
	     
	    //constructor to accept type parameter T
	    public ProcessGeneric(T param){
	        this.objReff = param;
	    }
	     
	    public T getObjReff(){
	        return this.objReff;
	    }
	     
		public T returnGenericValue(T aNum, T bNum) {
			
			T cNum = null;
			return cNum;
		}
	}
}
