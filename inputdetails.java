import java.lang.System;
import java.util.Scanner;
class inputdetails{
    public static void main(String args[])
    {
        Scanner asw=new Scanner(System.in);
        System.out.print("Enter a Name:");
        String a=asw.nextLine();
        System.out.print("Enter a Age:");
        int b=asw.nextInt();
        System.out.print("Enter a Address:");
        asw.nextLine();
        String c=asw.nextLine();
        System.out.println("My Name is:"+a);
        System.out.println("My Age is:"+b);
        System.out.print("My Address is:"+c);
    
    }
}