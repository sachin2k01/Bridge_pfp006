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
        double res=n1+n2;
        System.out.println("Sum of Two Number is"+res);

    }
}