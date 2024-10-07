package com.abhi.sample.overriding;

public class OverridingDemo {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.m1(); // Parent method invoked !!!!!
        System.out.println(p.hashCode());

        Child c = new Child();
        c.m1(); // Child method invoked !!!!!
        System.out.println(c.hashCode());

        Parent p1 = new Child();
        p1.m1(); // Child method invoked !!!!!
        System.out.println(p1.hashCode());

        // Method resolution is done/decided by JVM during runtime based on object
        //Runtime polymorphism / Dynamic Polymorphism / late binding

    }
}


class Parent {

    public void m1() {
        System.out.println("Parent method invoked !!!!!");
    }
}

class Child extends Parent {

    public void m1() {
        System.out.println("Child method invoked !!!!!");
    }
}