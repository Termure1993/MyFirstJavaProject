package com.company.lab2;

public class Lab2 {
    public static void main(String[] args) {
        int result = sum(2,3);
        System.out.println(result);

        result = divide(7,6);
        System.out.println(result);
        result = down(8,4);
        System.out.println(result);
        result = mult(7,9);
        System.out.println(result);

    }
        static int sum(int firstNumber,int secondNumber){
            return (firstNumber + secondNumber);
        }


       static int divide(int firstNumber,int secondNumber){
           return (firstNumber / secondNumber);
    }

       static int down(int firstNumber,int secondNumber){
          return (firstNumber - secondNumber);
        }
        static int mult(int firstNumber,int secondNumber){
          return (firstNumber * secondNumber);




            }
}

