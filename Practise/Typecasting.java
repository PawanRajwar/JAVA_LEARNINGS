package Paractise;

// In this we will learn how to do type casting in java 

import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    /* The important thing we have to understand is that java automatically do type conversion
     * but only  if the data type of the variable is smaller than the data type of the variable
     * example : byte to int, short to int, int to long, int to float.
     * Other than this we have to manually type cast to the data type we want  */

     int num =  (int) (10.5);
     System.out.println(num);
     // here we are type casting 10.5 to int so it will print 10
     // because int can't hold decimal value so it will truncate the decimal value and print the integer
     
     float num1 = (float) (10);
     System.out.println(num1);
     // here we are type casting 10 to float so it will print 10.0
     // because float can hold decimal value so it will print the integer with decimal value
     
     input.close();


    }
    
}
