
// Input currency in rupees and output in USD.
package Assignments.First_Java;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in rupees:");
        double rupees = input.nextDouble();
        double usd = rupees / 83;
        System.out.printf("Amount in USD is : %.2f\n ",  usd);
        input.close();

    }
}
