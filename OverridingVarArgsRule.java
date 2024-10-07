package com.abhi.sample.overriding;

public class OverridingVarArgsRule {

    public static void main(String[] args) throws Throwable {
        PMVA p = new PMVA();
        p.m1(10); // Parent method invoked !!!!!
        System.out.println(p.s);
        System.out.println(p.sta);

        CMVA c = new CMVA();
        c.m1(10); // Child method invoked !!!!!
        System.out.println(c.s);
        System.out.println(c.sta);

        PMVA p1 = new CMVA();
        p1.m1(10); // Child method invoked !!!!!
        System.out.println(p1.s);
        System.out.println(p1.sta);

    }

}

class PMVA {

    public String s= "Parent instance Variable";

    public static String sta= "Parent Static Variable";

    public void m1(int ... i) {
        System.out.println("Var Args method :-- > Parent method invoked !!!!!");
    }


}

class CMVA extends PMVA {

    public String s= "Child instance Variable";
    public static String sta= "Child Static Variable";  // variable hiding -- shadowing

    public void m1(int i) {
        System.out.println(" method :-- > Child method invoked !!!!!");
    }


}
