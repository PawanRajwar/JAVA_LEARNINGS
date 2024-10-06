
// Take integer inputs till the user enters 0 and print the sum of all numbers

package Assignments.Loops_and_Conditionals;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int sum = 0;
        while ( num != 0 ){
            sum = sum + num;
        }

    }
    
}
