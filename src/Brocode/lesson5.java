package Brocode;
import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args){
        //shopping cart program

        Scanner scanner=new Scanner(System.in);
        String item;
        int quantity;
        double price;
        double total;

        System.out.print("Hello to BBishk market. what would you like to buy today? : ");
        item=scanner.nextLine();
        System.out.print("What is the price for this item?: ");
        price= scanner.nextDouble();
        System.out.print("And how many would you like?: ");
        quantity= scanner.nextInt();

        total=price*quantity;

        System.out.println("\nYou bought "+quantity+" "+item+" and your total would be "+total+ "$");
    }
}
