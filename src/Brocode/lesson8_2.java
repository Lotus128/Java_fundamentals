package Brocode;
import java.util.Scanner;

public class lesson8_2 {
    // ТОЙРГИЙН ХҮРЭЭНИЙ УРТ ОЛОХ
    // ТОЙРГИЙН ТАЛБАЙ ОЛОХ
    // БӨМБӨРЦӨГИЙН ЭЗЭЛХҮҮН ОЛОХ

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        double r;

        System.out.println("Welcome to 3 basic circle math program. You enter the radius and we will give you\n1. Circumference\n2. Circle area\n3. Sphere volume");
        System.out.print("Enter the radius please: ");
        r= scanner.nextDouble();

        System.out.printf("\nCircumference is %.2f cm",(2*Math.PI*r));
        System.out.printf("\nCircle area is %.2f cm^2",(Math.PI*Math.pow(r,2)));
        System.out.printf("\nSphere volume is %.2f cm^3",((4.0/3.0)*Math.PI*Math.pow(r,3)));

    }
}
