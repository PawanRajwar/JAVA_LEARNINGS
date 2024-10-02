package Paractise;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This a program to check if a number is even or odd");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int number = input.nextInt();

        if( number % 2 == 0){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }
        input.close();


    }
    
}
