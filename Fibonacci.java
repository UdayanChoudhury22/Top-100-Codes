import java.util.Scanner;
public class Fibonacci
{
    static void fibonacci(int num)
    {
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        for(int i=2;i<num;i++)
        {
            int next=first+second;
            System.out.print(next+" ");
            second=next;
            first=second;
        }
    }

    static int fibonacci_term(int num)
    {
        int a=0;
        int b=1;
        int next=0;
        int sum=0;
        for(int i=2;i<num;i++)
        {
            next=a+b;
            sum+=next;
            b=next;
            a=b;
        }
        return sum+1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        fibonacci(num);
        
        System.out.println("\nSum: " +fibonacci_term(num));
    }
}