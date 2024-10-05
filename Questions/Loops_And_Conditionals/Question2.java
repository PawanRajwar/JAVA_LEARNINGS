
// Input a number and print all the factors of that number (use loops).

package Assignments.Loops_and_Conditionals;
import java.util.Scanner;


public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        for ( int i = 1; i <= num; i++){
            if ( num % i == 0){
                System.out.println(i);
            }
        }
        input.close();
       
    }
}
