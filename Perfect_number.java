//sum of factors equal to the number..
import java.util.Scanner;

public class Perfect_number
{

    static boolean isPerfect(int num)
    {
        int org=num;
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        if(sum==org)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(isPerfect(num))
            System.out.println("Yess perfect number!!");
        else
        System.out.println("NO non perfect number!!");
    }
}
    