
// Calculate distance between two points

package Assignments.Loops_and_Conditionals;
import java.util.Scanner;

public class Questions5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 for two dimensions and 3 for three dimensions : ");
        int dimensions = input.nextInt();
        double x1, x2, y1, y2, z1, z2 = 0;

        if ( dimensions == 2){
            System.out.println("Enter the coordinates for first point ( x1, y1 ) : ");
            x1 = input.nextDouble();
            y1 = input.nextDouble();
            System.out.println("Enter the coordinates for second point ( x2, y2 ) : ");
            x2 = input.nextDouble();
            y2 = input.nextDouble();

            double distance = Math.sqrt(Math.pow(x2 - x1, 2 ) +  Math.pow(y2 - y1, 2));
            System.out.printf("The distance between the two points is : %.2f\n", distance);

        }
        else if ( dimensions == 3){
            System.out.println("Enter the coordinates of first point (  x1, y1, z1 ) : " );
            x1 = input.nextDouble();
            y1 = input.nextDouble();
            z1 = input.nextDouble();

            System.out.println("Enter the coordintes of second point ( x2, y2, z2 ) : ");
            x2 = input.nextDouble();
            y2 = input.nextDouble();
            z2 = input.nextDouble();

            double distance = Math.sqrt(Math.pow( x2 - x1 , 2) + Math.pow( y2 - y1 , 2) + Math.pow( z2 - z1, 2));
            System.out.printf("The distance between two points is : %.2f\n", distance);
            
        }
        else{
            System.out.println("Invalid input please enter either 2 or 3");
        }

        input.close();

    }
}
