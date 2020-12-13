package com.company.lab2;

public class Lab2 {
    public static void main(String[] args) {
        int result = sum(56,67);
        System.out.println(result);

        double rest = divide(345,234);
        System.out.println(rest);
        int inmultire = multiplication(45,56);
        System.out.println(inmultire);
        int scadere = minus(34,23);
        System.out.println(scadere);

        prinMyName();

        float m = media(3,5,6);
        System.out.println(m);

        double o = rest1(12,7);
        System.out.println(o);
        System.out.println(java);
        System.out.println(robot);

    }
    static int sum(int firstNumber,int secondNumber) {
        return (firstNumber + secondNumber);
    }
    static double divide (double Number1,double Number2) {
        return (Number1 / Number2);
    }
    static int multiplication (int a,int b) {
        return (a*b);
    }
    static int minus (int c,int d) {
        return (c-d);
    }
    static void prinMyName() {
        System.out.println("Hello \nAdrian");

    }
    static float media(float a,float b,float c) {
        return ((a+b+c)/3);
    }
    static double rest1(double r ,double p) {
        return r%p;
    }
    static String java = "    J    a   v     v  a\n   J   a a   v   v  a a\nJ  J  aaaaa   V V  aaaaa\n JJ  a     a   V  a     a";
    static String robot = "  +\"\"\"\"\"+\n (| o o |) \n  |  ^  |\n  | '_' |\n  +_____+";

}

