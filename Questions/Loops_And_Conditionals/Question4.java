
// Calculate Average Of N Numbers

package Assignments.Loops_and_Conditionals;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values (N) :  ");
        int num = input.nextInt();
        double sum = 0;
        for  ( int i = 0; i < num; i++ ){
            double number = input.nextDouble();
            sum = sum + number;
        }
        double average = sum / num;
        System.out.println("Average of"  + " " + num + " " + "numbers is" + " " + average);
        input.close();

        
    }
    
}
