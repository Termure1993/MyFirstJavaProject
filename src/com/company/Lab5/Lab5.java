package com.company.Lab5;

import java.util.stream.IntStream;

public class Lab5 {
    public static void main(String[] args) {
        Logic5 logic = new Logic5();
        //int[] myArray = logic.setConsecutiveValuesToArray(1,100);

        //logic.printArray(myArray);

        //System.out.println(logic.checkSum(5,6, 8,9));
        //System.out.println(logic.checkSum(3,8));
        //System.out.println(logic.checkSum(4,7,8));


        int [] array = new int[100];
      //array = logic.valoriPare(array);

      // logic.printArray(array);

              // 4.media

                //logic.populateArrayWithValues(array,11);

               // System.out.println(logic.media(array));

        //5.
        // String [] clasa = {"Ovi", "Mihai", "Cristi"};

       // System.out.println(logic.checkString(clasa,"Alex"));

        //6
        //int [] numere = IntStream.range(3, 7).toArray();

       // logic.checkNumber(numere,4);

        //7.
       // String [] myArray= logic.setArrayMinus(7);
        //logic.printMinus(myArray);
        //logic.printMinus2(myArray,6);

        int[] thirdArray = {1,6,12,24,7,2};
        int[] emptyArray= new int[thirdArray.length];
//        8.
        //int Value=24;
       // logic.arrayWithoutValue(thirdArray,Value);

               // logic.secondminArray(thirdArray);

               logic.copyArray(thirdArray,emptyArray);

    }

}
