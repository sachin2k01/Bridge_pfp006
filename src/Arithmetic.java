import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Calender");
        System.out.println("Enter First Number");
        double n1=sc.nextDouble();
        System.out.println("Enter Second Number Number");
        double n2=sc.nextDouble();
        System.out.println("Enter 1. for Addition\n Enter 2. for Subtraction\n");
        System.out.println("Choose an Option");
        int ch=sc.nextInt();
        if(ch==1)
        {
            double res=n1+n2;
            System.out.println("Sum of Two Number is"+res);
        } else if (ch==2)
        {
            double res=n1-n2;
            System.out.println("Sub of Two Number is"+res);
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}