package Paractise;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int count = 0;
        while( num > 0){
            int digit = num % 10;
            if( digit == 2){
                count++;
            }
            num = num / 10;

        }
        System.out.println("Count of 2 is : "+count);
    }
    
}
