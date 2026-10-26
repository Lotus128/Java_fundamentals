package Brocode;

public class lesson1 {
    public static void main(String[] args){
        //variable = reusable container for the value

        // 2 төрөлтэй энгийн ба обьект заагч.

        //Primitive(энгийн)- Утгаа шууд түр санах ой (stack)-д хадгална
        //Reference(обьект заагч)- Утгаа обьектийн байрлах байршил (Heap) руу заасан түр санах ойд(Stack) хадгална.

        // Primitive      |      Reference
        //   int          |       string
        //   double       |       array
        //   float        |       object
        //   char         |       scanner
        //   boolean      |

        // Хувьсагч зарлах:
        //  1. Зарлах         int age;
        //  2. Утга заах      int age = 30;
        int age =19;
        int year = 2026;
        int quatity = 2;

        double price= 19999.99;
        double gpa = 2.4;
        double temperature = 24.5;

        char grade = 'A';
        char symbol = '?';
        char currency = '₮';

        boolean forsale= true;
        boolean graduating= true;
        boolean isstudent=true;

        String name = "Bbishk";
        String car = "Mustang";
        String food = "Chicken skin";
        String color = "Plum";

        System.out.println("My name is "+ name);
        System.out.println("I am "+age+"Years old");
        System.out.println("Your choice of car is "+color+ " "+ car);
        System.out.println("My fav food is "+ food);

        if (forsale) {
            System.out.println(car + "is for sale");
        }
        else {
            System.out.println(car + "is not for sale yet");
        }

    }
}
