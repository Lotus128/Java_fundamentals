package Brocode;
import java.util.Scanner;

public class lesson11 {

    // COMPOUND INTEREST CALCULATOR

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double final_amount, start_amount, interest_rate, number_per_year, total_year;

        System.out.println("Welcome to the compound interest calculator");
        System.out.print("\nPlease enter the principal amount: ");
        start_amount=scanner.nextDouble();
        System.out.print("Please enter the interest rate: ");
        interest_rate= scanner.nextDouble()/100;
        System.out.print("Please enter the # of times compounded per year: ");
        number_per_year= scanner.nextDouble();
        System.out.print("Please enter the # of year: ");
        total_year= scanner.nextDouble();

        final_amount=start_amount*Math.pow((1+(interest_rate/number_per_year)),(number_per_year*total_year));

        System.out.printf("The amount after %.0f year is %.2f$", total_year, final_amount);

    }
}
