//(sum of divisors)/num1==(sum of divisors)/num2
import java.util.Scanner;
public class Friendly_pair {

    static int sum_divisors(int num)
    {
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
                sum+=i;
        }
        return (sum/num);
    }

    static boolean isFriendly(int num1,int num2)
    {
        if(sum_divisors(num1)==sum_divisors(num2))
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(isFriendly(num1,num2))
            System.out.println("Yes Friendly pair!!");
        else
            System.out.println("Non Friendly pair!!");
    }
    
}
