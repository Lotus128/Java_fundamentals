package Brocode;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args){

        //arithmetics
        Scanner too=new Scanner(System.in);
        double a,b,c,d,e,result;

        System.out.println("Our problem goes like this: \n a/b+(c-d)*e");
        System.out.println("So please enter the value of: ");

        System.out.print("a: ");
        a=too.nextDouble();
        System.out.print("b: ");
        b=too.nextDouble();
        System.out.print("c: ");
        c=too.nextDouble();
        System.out.print("d: ");
        d=too.nextDouble();
        System.out.print("e: ");
        e=too.nextDouble();
        result=a/b+(c-d)*e;
        System.out.println("Result is "+result);
    }
}
