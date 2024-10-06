import java.util.Scanner;
class adddivide{
    public static void main(String args[])
     {
        Scanner asw=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a=asw.nextInt();
        System.out.print("Enter a Number:");
        int b=asw.nextInt();
        System.out.print("Enter a Number:");
        int c=asw.nextInt();
       
        int d =a*b*c;
        System.out.println("Multiply is:"+d);
   
        int e=a+b+c;
        System.out.println("Sum is:"+ e);
        System.out.print("Divide is:");
        System.out.print(d/e);

        
    }
}