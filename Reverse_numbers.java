//1234=4321
import java.util.Scanner;

public class Reverse_numbers
{

    static void reverse(int num)
    {
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("Reverse is : "+rev);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        reverse(num);
    }
}
    