//sum of digits is divide the number..
import java.util.Scanner;

public class Harshad_number {
    static boolean isHarshad(int num)
    {
        int sum=0;
        int org_num=num;
        while(num>0)
        {
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        if(org_num%sum==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(isHarshad(num))
            System.out.println("Yess!! Harshad number..");
        else
            System.out.println("NO non Harshad number..");
    }
    
}
