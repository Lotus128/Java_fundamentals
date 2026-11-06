package Brocode;
import java.util.Scanner;

public class lesson12 {

    //we are checking nested if statements
    //we change our boolean to true or false to check all the possible outcome in our nested if statement

    //this is movie theater and ticket is 9.99$. Seniors have 20% off while students have 10% off.

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        boolean answerr, isstudent, issernior;
        String answer;
        double ticket=9.99;

        System.out.println("Welcome to the movie theater. The ticket price is 9.99$.");
        System.out.print("Quick survey. Do you wanna answer questions? (Y/N): ");
        answer=scanner.next();

        while(!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")){
            System.out.print("Invalid answer! Do you wanna answer questions? (Y/N): ");
            answer=scanner.next();
        }
        answerr=answer.equalsIgnoreCase("Y");

        if(answerr){
            System.out.print("Are you a senior?(true/false): ");
            issernior=scanner.nextBoolean();
            System.out.print("Are you a student? (true/false): ");
            isstudent= scanner.nextBoolean();

            if(isstudent){
                if(issernior){
                    System.out.println("You get Student discount of 10% !!!");
                    System.out.println("You get Senior discount of 20% !!!");
                    ticket*=0.7;
                }else{
                    System.out.println("You get Student discount of 10% !!!");
                    ticket*=0.9;
                }
            }else{
                if(issernior){
                    System.out.println("You get Senior discount of 20% !!!");
                    ticket*=0.8;
                }
            }
        }else{
            System.out.println("Your ticket will be 9.99$ Enjoy your movie!");
            return;
        }
        System.out.printf("Your ticket will be %.2f$", ticket);
    }
}
