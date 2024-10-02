package Paractise;
// In this code we will learn how to take inputs in Java

import  java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Taking Inputs in Java");
        Scanner input = new Scanner(System.in);
        
        // First we will se how to take integer as input
        
        System.out.println("Enter an Integer : ");
        int num1 = input.nextInt();
        System.out.println("You entered : " + num1);

        // Now we will see how to take float as input

        System.out.println("Enter a Float : ");
        float num2 = input.nextFloat();
        System.out.println("You entered : " + num2);

        // Now we will see how to take String as input

        System.out.println("Enter a String : ");
        String str = input.next(); // this only take a word as input means whenever there is a space it  stops taking input
        System.out.println("You entered : " + str);

        input.nextLine();

        System.out.println("Enter a String : ");
        String str1 = input.nextLine();
        System.out.println("You entered : " + str1);

        input.close();
        
    }
    
    
}
