
// Subtract the Product and Sum of Digits of an Integer

package Assignments.Loops_and_Conditionals;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int product = 1;
        int sum = 0;
        while ( num > 0){
            int digit = num % 10;
            sum  = sum + digit;
            product = product * digit;
            num = num / 10;
        }
        System.out.println("Product of digits : " + product);
        System.out.println("The  sum of digits : " + sum);
        System.out.println("The difference of Products and Sum of digits of number is :  " + (product - sum));

        input.close();
 
    }
}
