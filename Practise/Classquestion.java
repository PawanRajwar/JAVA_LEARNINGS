package Paractise;
import java.util.Scanner;

public class Classquestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("First number is : " + num1);
        System.out.println("Second number is : " + num2);


    }


    
}
