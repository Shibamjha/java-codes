package com.abhi.sample.overriding;

import java.io.FileNotFoundException;

public class Modifiers_Static_ExceptionRule {

    public static void main(String[] args) throws Throwable {
        PM p = new PM();
        p.m1(); // Parent method invoked !!!!!
        p.m3();
        p.m4();
        p.m5();
        p.m6();

        CM c = new CM();
        c.m1(); // Child method invoked !!!!!
        c.m3();
        c.m4();
        c.m5();
        c.m6();

        PM p1 = new CM();
        p1.m1(); // Child method invoked !!!!!
        p1.m3();
        p1.m4();
        p1.m5();
        p1.m6();

    }

}

class PM {

    public void m1() {
        System.out.println("Final method :-- > Parent method invoked !!!!!");
    }

    private void m2() {
        System.out.println("Private method :-- > Parent method invoked !!!!!");
    }
    void m3() {
        System.out.println("default method :-- > Parent method invoked !!!!!");
    }

    public static void m4(){
        System.out.println("Static Method :-- > Parent method invoked !!!!!!!");
    }

    public void m5() throws Throwable {
        System.out.println("Exception throws Method :-- > Parent method invoked !!!!!!!");
    }
    public void m6() {
        System.out.println("Unchecked Exception throws Method :-- > Parent method invoked !!!!!!!");
    }

    protected void m7() {
        System.out.println("Protected method :-- > Parent method invoked !!!!!");
    }

    void m8() {
        System.out.println("Default method :-- > Parent method invoked !!!!!");
    }
}

class CM extends PM {

    public final void m1() {
        System.out.println("Final method :-- > Child method invoked !!!!!");
    }

   private void m2() {
        System.out.println("Private method :-- > Child method invoked !!!!!");
    }

    public void m3() {
        System.out.println("public method :-- > Child method invoked !!!!!");
    }

    public static void m4(){
        System.out.println("Static Method :-- > Child method invoked !!!!!!!");
    } // method Hiding

    public void m5()throws FileNotFoundException {
        System.out.println("Checked Exception throwing :-- > Child method invoked !!!!!!!");
        //throw new FileNotFoundException();
    }

    public void m6()throws NullPointerException{
        System.out.println("Unchecked Exception throws Method :-- > Child method invoked !!!!!!!");
    }

    protected void m7() {
        System.out.println("Protected method :-- > Child method invoked !!!!!");
    }

     void m8() {
        System.out.println("Default method :-- > Parent method invoked !!!!!");
    }

}
