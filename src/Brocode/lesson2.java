package Brocode;
import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args){
        //calculate the area of rectangle

        double width=0;
        double height=0;
        double area = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter width: ");
        width =s.nextDouble();

        System.out.println("Please enter height: ");
        height=s.nextDouble();

        area=width*height;
        area= area/2;

        System.out.println("The area is "+area+"cm^2");

    }
}
