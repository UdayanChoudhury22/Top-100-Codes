import java.util.Scanner;
public class Negetive_Postive
{
    static boolean ispositive(int num)
    {
        if(num>0)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num==0)
            System.out.println("Number is not positive or negetive");

        else if(ispositive(num))
            System.out.println(num+ " is positive");
        else
            System.out.println(num+" is negetive");

    }
}