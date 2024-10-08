
// Take 2 numbers as input and print the largest number.

package Assignments.First_Java;
import java.util.Scanner;


public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float num1 = input.nextFloat();
        System.out.println("Enter the second number : ");
        float num2 = input.nextFloat();

        if ( num1 > num2 ){
            System.out.println("Greatest number is : " + num1);
        }

        else {
            System.out.println("Greatest number is : " + num2);
        }

        input.close();
    }
    
}
