import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Calender");
        do {
            System.out.println("Enter 1. for Addition\nEnter 2. for Subtraction\nEnter 3. for Multiplication\nEnter 4. for Division\nEnter 5. for Mod\nEnter Other Key to exit");
            System.out.println("Choose an Option");
            int ch = sc.nextInt();
            if(ch==0||ch>=5)
            {
                System.exit(0);
            }
            System.out.println("Enter First Number");
            double n1 = sc.nextDouble();
            System.out.println("Enter Second Number Number");
            double n2 = sc.nextDouble();

            switch (ch) {
                case 1:
                    System.out.println("Addition of two Number: ");
                    break;

                case 2:
                    System.out.println("Subtraction of two Number: ");
                    break;
                case 3:
                    System.out.println("Multiply of two Number: ");
                    break;
                case 4:
                    System.out.println("Division of two Number: ");
                    break;
                case 5:
                    System.out.println("Mod of two Number: ");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (true);
    }
}