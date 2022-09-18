//sum of cube of digits of number equal to the number..
import java.util.Scanner;
public class Armstrong_number {

    static int count(int num)
    {
        int c=0;
        while(num>0)
        {
            num/=10;
            c++;
        }
        return c;
    }

    static boolean isArmstrong(int num)
    {
        int sum=0;
        int org=num;
        double c=(double)count(num);
        while(num>0)
        {
            double rem=(double)num%10;
            sum+=Math.pow(rem,count(num));
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
        System.out.println(("Enter a number: "));
        int num=sc.nextInt();
        if(isArmstrong(num))
            System.out.println("Yess armstrong number..");
        else
            System.out.println("No non armstrong number..");
    }
    
}
