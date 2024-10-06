import java.util.Scanner;
import java.lang.System;
class StringCompare {

    

    public static void main(String args[])
    {
        Scanner asw=new Scanner(System.in);
        System.out.print("Enter a String:");
        String a=asw.nextLine();
        System.out.print("Enter a String:");
        String b=asw.nextLine();
        if(a.equals(b))
        {
        
        System.out.print("The String is Same.");
    }
        else
        {
        
            System.out.print("The String is Not Same");
        }
  
        
    
}
}
