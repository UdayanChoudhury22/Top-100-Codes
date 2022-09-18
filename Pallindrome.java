//number equal to its reverse..
import java.util.Scanner;

public class Pallindrome
{
    static boolean isPallindrome(int num)
    {
        int rev=0;
        int org=num;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(rev==org)
            return true;
        else
            return false;
    }

    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(isPallindrome(num))
            System.out.println("Yess pallindrome number!!");
        else
        System.out.println("NO non pallindrome number!!");
    }
}
    