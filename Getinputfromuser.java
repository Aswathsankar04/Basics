import java.lang.System;
import java.util.Scanner;
 class Getinputfromuser{
    public static void main(String args[] ) 
    {
        Scanner asw=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a=asw.nextInt();
        System.out.print("The Number is:");
        System.out.print(a);
        
    }
 }