import java.util.Scanner;
class NumbersCompare{
    public static void main(String args[])
    {
        Scanner asw=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a=asw.nextInt();
        System.out.print("Enter a Number:");

        int b=asw.nextInt();
        if(a==b)
        {
            System.out.print("The number is same");
        }
        else{
            System.out.print("The number is not same");
        } 
}
}