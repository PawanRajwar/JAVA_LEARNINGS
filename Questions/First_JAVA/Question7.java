
// To calculate Fibonacci Series up to n numbers.

package Assignments.First_Java;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = input.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for( int i = 0; i < n; i++ ){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        input.close();


    }
    
}
