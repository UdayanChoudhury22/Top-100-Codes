import java.util.Scanner;
public class Even_odd
{
    static boolean iseven(int num)
    {
        if(num%2==0)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num==0)
            System.out.println("Number is zero");

        else if(iseven(num))
            System.out.println(num+ " is even");
        else
            System.out.println(num+" is odd");

    }
}