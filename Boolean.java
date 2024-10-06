import java.util.Scanner;
class Boolean{
    public static void main(String args [])
{
    Scanner asw=new Scanner(System.in);
    //if rain give the input true ,if not rain give the input false.//
    System.out.print("Enter a True or False :");
    boolean a=asw.nextBoolean();
    if(a)
    {
        System.out.println("Yes,You Need To Take The Umberlla");

    }
    else{
        System.out.print("No,You Don't Need To Take The Umberlla");
    }
}
}