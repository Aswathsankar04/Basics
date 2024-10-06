import java.lang.System;
import java.util.Scanner;
class Add{
    public static void main(String args[])
    {
        Scanner asw=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a=asw.nextInt();
        System.out.print("Enter a Number:");
        int b=asw.nextInt();
        System.out.print("The Sum is :");
        System.out.print(a+b);
    }
}