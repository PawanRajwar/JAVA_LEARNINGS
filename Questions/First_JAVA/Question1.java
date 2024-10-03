
// Write a program to print whether a number is even or odd, also take input from the user

package Assignments.First_Java;
import java.util.Scanner;

public class Question1 {
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
