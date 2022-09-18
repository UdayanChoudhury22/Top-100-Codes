//sum of factorials equal to the number..
import java.util.Scanner;

public class Strong_number
{

    static int factorials(int num)
    {
        int sum=1;
        for(int i=1;i<=num;i++)
        {
            sum*=i;
        }
        return sum;
    }

    static boolean isStrong(int num)
    {  
        int sum=0;
        int org=num;
        while(num>0)
        {
            int rem=num%10;
            sum+=factorials(rem);
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
        if(isStrong(num))
            System.out.println("Yess strong number!!");
        else
        System.out.println("NO non strong number!!");
    }
}
    