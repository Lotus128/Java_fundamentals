package Exercise;
import java.util.Scanner;

public class mad_libs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String adjective1;
        String adjective2;
        String bird;
        String room;
        String verb1;
        String verb2;
        String relative;
        String noun1;
        String liquid;
        String verb3;
        String body;
        String noun2;
        String verb4;
        String noun3;


        System.out.print("Please enter adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("Please enter adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("Please enter a type of bird: ");
        bird = scanner.nextLine();

        System.out.print("Please enter room in a house: ");
        room = scanner.nextLine();

        System.out.print("Please enter a ver in past tense: ");
        verb1 = scanner.nextLine();

        System.out.print("Please enter a verb: ");
        verb2 = scanner.nextLine();

        System.out.print("Please enter a relative's name: ");
        relative = scanner.nextLine();

        System.out.print("Please enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Please enter a liquid: ");
        liquid = scanner.nextLine();

        System.out.print("Please enter verb ending in -ing: ");
        verb3 = scanner.nextLine();

        System.out.print("Please enter part of the body (plural): ");
        body = scanner.nextLine();

        System.out.print("Please enter plural noun: ");
        noun2 = scanner.nextLine();

        System.out.print("Please enter verb ending in -ing: ");
        verb4 = scanner.nextLine();

        System.out.print("Please enter a noun: ");
        noun3 = scanner.nextLine();


        System.out.println("\n");
        System.out.println("Now i present you the full sentence filled by the words you gave me!");
        System.out.println("\n");
        System.out.println("It was a "+adjective1+", cold November day. I");
        System.out.println("woke up to the "+adjective2+" smell of "+bird);
        System.out.println("roasting in the "+room+" downstairs. I");
        System.out.println(verb1+" down the stairs to see if i could");
        System.out.println("help "+verb2+" the dinner. My mom said,");
        System.out.println("\"See if "+relative+" needs a fresh "+ noun1+"\""+". So I");
        System.out.println("carried a tray of glasses full of "+liquid+" into");
        System.out.println("the "+verb3+" room. When i got there, I");
        System.out.println("couldn't believe my "+body+"! There were");
        System.out.println(noun2+" "+verb4+" on the "+noun3+"!");


        scanner.close();
    }
}