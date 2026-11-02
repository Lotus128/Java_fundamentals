package Brocode;
import java.util.Scanner;

public class lesson6 {

    //if statement= Энэ нь хэрвээ if нөхцөл үнэн бол кодыг биелүүлдэг.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        Boolean isStudent;

        System.out.print("Please enter your name: ");
        name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (True/False): ");
        isStudent = scanner.nextBoolean();


        //name check

        if(name.isEmpty()){
            System.out.println("WHY DID YOU NOT ENTER YOUR NAME???");
        }else{
            System.out.println("Hello "+name+"!");
        }

        //age check
        if(age>=65){
            System.out.println("You are a senior");
        }else if(age>=18){
            System.out.println("You are an adult");
        } else if(18<age || age>=13) {
            System.out.println("You are a teenager");
        }else if(age==0){
            System.out.println("You are just a baby");
        } else if(age<0){
            System.out.println("You have not been born yet! You are the youngest person ever");
        } else{
            System.out.println("Your are not a human");
        }

        //student check

        if(isStudent){
            System.out.println("You are a student");
        }else{
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}