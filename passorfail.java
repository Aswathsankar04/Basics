import java.util.Scanner;
class passorfail{
    public static void main(String args[])
    {
        Scanner asw=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int mark =asw.nextInt();
        if (mark>=35  && mark<=100)
        {
            System.out.print("Pass");
        }
        else if(mark<35)
        {
            System.out.print("Fail");
        }
        else if(mark>=100)
        {
        System.out.print("Invalid");
        }
    }
    

    
}