package com.codex.lang.java.generic;

public class PassValueGenerics { 
    public static void main(String a[]){
         
        SimpleGeneric<String> sgs = new SimpleGeneric<String>("AnuragTiwari");
        sgs.printType();

        SimpleGeneric<Boolean> sgb = new SimpleGeneric<Boolean>(Boolean.TRUE);
        sgb.printType();
        
        SimpleGeneric<Integer> sgi = new SimpleGeneric<Integer>(1);
        sgi.printType();
    }
}
 
class SimpleGeneric<T>{
     
    //declaration of object type T
    private T objReff = null;
     
    //constructor to accept type parameter T
    public SimpleGeneric(T param){
        this.objReff = param;
    }
     
    public T getObjReff(){
        return this.objReff;
    }
     
    //this method prints the holding parameter type
    public void printType(){
        System.out.println("Type: "+objReff.getClass().getName());
    }
}
