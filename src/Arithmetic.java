import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Calender");
        Functions f=new Functions();
        do {
            System.out.println("Enter 1. for Addition\nEnter 2. for Subtraction\nEnter 3. for Multiplication\nEnter 4. for Division\nEnter 5. for Mod");
            System.out.println("Choose an Option");
            int ch = sc.nextInt();
            System.out.println("Enter First Number");
            double n1 = sc.nextDouble();
            System.out.println("Enter Second Number Number");
            double n2 = sc.nextDouble();

            switch (ch) {
                case 1:
                    System.out.println("Addition of two Number: "+f.Add(n1,n2));
                    break;
                case 2:
                    System.out.println("Subtraction of two Number: "+f.Sub(n1,n2));
                    break;
                case 3:
                    System.out.println("Multiply of two Number: "+f.Mul(n1,n2));
                    break;
                case 4:
                    System.out.println("Division of two Number: "+f.Div(n1,n2));
                    break;
                case 5:
                    System.out.println("Mod of two Number: "+f.Mod(n1,n2));
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println("If You wish to Exit Press 0");
            int op = sc.nextInt();
            if (op==0)
            {
                System.exit(0);
            }
        }while (true);
    }
}