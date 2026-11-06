package Brocode;
import java.util.Scanner;

public class lesson8_1 {

    //   ГИПОТЕНУЗ олох

    public static void main(String[] args){

        double a, b, c;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Welcome to program that find the hypotenuse. ");
        System.out.println("!!! WARNING. Remember the angle between the a and b side should be 90 degree");
        System.out.print("\nPlease enter the a side(the height): ");
        a= scanner.nextDouble();
        System.out.print("Please enter the b side(the base): ");
        b= scanner.nextDouble();

        System.out.println("\nThe c side (hypotenuse) is "+Math.sqrt(Math.pow(a,2)+Math.pow(b,2))+"cm");


    }
}
