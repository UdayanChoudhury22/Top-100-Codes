
import java.util.Scanner;
public class Factors_Primefactors {

    static void factor(int num)
    {
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
                System.out.print(i+" ");
        }
    }

    static boolean prime(int num)
    {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                return false;
            
        }
        return true;
    }

    static void prime_factor(int num)
    {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                if(prime(i))
                    System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        factor(num);
        System.out.println();
        prime_factor(num);
    }
    
}
