package com.abhi.sample.strings;

public class StringSampleCode {

    public static void main(String[] args) {

        // Use Case 1:--> Immutable vs Mutable
        String str = new String("Java");
        str.concat(" School");
        System.out.println(str); // Java

        // Str :--> "Java"
        // "Java School"

        String str1 = new String("Python");
        System.out.println(str1.hashCode());
        str1=str1.concat(" Programming");
        System.out.println(str1.hashCode());
        System.out.println(str1); // Python Programming

        // Str1 :--> "Python"
        // Str1 :--> "Python Programming"

        str.equals(str1);


        StringBuffer stringBuffer = new StringBuffer("Java");
        System.out.println(stringBuffer.hashCode());
        stringBuffer.append(" School");
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuffer); // Java School

        // Use Case 2 :---> SCP (String Constant Pool) ::-> String literal working

        String str2 = new String("TAJMAHAL"); // way 1
        // Heap :--> "TAJMAHAL"   SCP :--> "TAJMAHAL"

        String str3 = "TAJMAHAL"; // Way 2
        //Heap :--> NO object   SCP :--> "TAJMAHAL"
        System.out.println(str3.hashCode());
        String s4 = "TAJMAHAL";
        //Heap :--> NO  SCP :--> "TAJMAHAL"
        System.out.println(s4.hashCode());

        String s5 = "Red Fort";
        //Heap :--> NO  SCP :--> "Red Fort"

        String sss = new String("hgjkbgfjldfjl");
        String sss1 = new String("hgjkbgfjldfjl");

        // Heap :-->     SCP :-->
        // Heap :-->     SCP :-->

    }
}
