package com.dmitrijus.app;

public class HelloWorld {
    public static void main (String[] args){
        System.out.println("Goodbye, world.");
        System.out.println("Goodbye, world.");
        System.out.println("------------");

        //Kint. dekalracija
        int i;
        //deklaracija ir inicializacia
        int j = 5;
        int z = 5;
        //Uniary operatorius (post-increment0
        j++;
        //j=j+1;
        //j+=1;
        //++j;
        //Uniary (pre-increment)
        System.out.println(++j);
        System.out.println(j++);//reiksme pasikeicia po sitos eilutes
        //Uinary operatorius
        int result = z + j;
        System.out.println(result);

        //"+" overload operator
        System.out.println(5 + 6);
        System.out.println("5" + "6");

        //casting
        double d = 5.5;
        int di = (int)d;
        System.out.println(di); //skaicius  po kablelio numetamas
        float f1 = 5.9f;
        double d1 = f1;//priskirti galime be casto
        double d2 = 5.9;
        float f2 = (float) d2; //reikia castinti, nes  doulbe yra didesnis (rizika prarasti duomenis)

        //String
        String s2 = "\uD83e\uDDE0";
        System.out.println(s2);

        //Equality
        String s3 = "ABC";
        String s4 = new String ("ABC");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(!s3.equals(s4));

        // int equality
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 == i2);

        System.out.println("----------");
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println("ABC".endsWith("BC"));
        System.out.println("ABC".endsWith("bc"));
        System.out.println("ABC".toLowerCase());
        System.out.println("ABC".toLowerCase().endsWith(("bc")));
        System.out.println("ABC".length());
        System.out.println("ABC".replace("A", "Z"));
    }
}
