package com.abhi.sample.overloading;

public class MethodOverloading{


public void methodOne(){ // methodOne is overloaded

System.out.println("No args method called");

}

public void methodOne(int i){
System.out.println("int arguments method called");
}

public int methodOne(String str){
System.out.println("String args method called");
return 0;
}

public void methodOne(int i, String str){
System.out.println("int,String args method called");
}


public static void main (String args []){

MethodOverloading mo = new MethodOverloading();
mo.methodOne(10,"Abhi"); // Method resolution
mo.methodOne(10);
mo.methodOne("Anuradha");
mo.methodOne(10, "Anuradha");

}

}

