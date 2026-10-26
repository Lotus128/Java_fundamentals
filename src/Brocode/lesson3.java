package Brocode;
import java.util.Scanner;
public class lesson3 {
    public static void main(String[] args){

        //mad libs game
        Scanner scanner=new Scanner(System.in);
        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Please enter an adjective: ");
        adjective1=scanner.nextLine();
        System.out.print("Please enter a noun: ");
        noun=scanner.nextLine();
        System.out.print("Please enter an adjective: ");
        adjective2=scanner.nextLine();
        System.out.print("Please enter a verb: ");
        verb= scanner.nextLine();
        System.out.print("Please enter an adjective: ");
        adjective3=scanner.nextLine();


        System.out.println("\nToday my class went to "+adjective1);
        System.out.println("I saw the biggest " +noun);
        System.out.println("It was crazy. My classmate saw "+adjective2);
        System.out.println("Then suddenly "+adjective2+"came closer and "+verb+" "+noun);
        System.out.println("We were "+adjective3);
    }
}
