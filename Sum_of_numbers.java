import java.util.Scanner;
public class Sum_of_numbers
{
    static int sum(int num)
    {
        int res=0;
        for(int i=1;i<=num;i++)
        {
            res+=i;
        }
        return res;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num==0)
            System.out.println("Number is zero");

        System.out.println("The sum is: "+sum(num));

    }
}