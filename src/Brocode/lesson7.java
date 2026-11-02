package Brocode;
import java.util.Random;
import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args) {

        // RANDOM NUMBER GENERATOR

        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        int number;
        double decimal;
        Boolean isheads;
        char guess;

        int numberlowest;
        int numberhighest;

        double decimallowest;
        double decimalhighest;

        System.out.println("\nA.Whole number\nB.Decimal\nC.Heads or Tails\n\nWhich one of these randomness do you want?\nYour answer is: ");
        guess=scanner.next().charAt(0);

        if(guess == 'A' || guess == 'a') {
            System.out.print("Enter the lowest number you want to get: ");
            numberlowest=scanner.nextInt();
            System.out.print("Enter the highest number you want to get: ");
            numberhighest=scanner.nextInt();

            number=random.nextInt(numberlowest, numberhighest);

            System.out.println("Your random number between "+numberlowest+" and "+numberhighest+" is "+number);

        }else if(guess =='B' || guess == 'b'){
            System.out.print("Enter the lowest number you want to get: ");
            decimallowest=scanner.nextInt();
            System.out.print("Enter the highest number you want to get: ");
            decimalhighest=scanner.nextInt();

            decimal=random.nextDouble(decimallowest, decimalhighest);

            System.out.println("Your random decimal number between "+decimallowest+" and "+decimalhighest+" is "+decimal);
        }else if(guess=='C' || guess=='c'){
            isheads=random.nextBoolean();
            if(isheads){
                System.out.println("Your random coin side is HEADS");
            }else{
                System.out.println("Your random coin side is TAILS");
            }
        }

    }

}
