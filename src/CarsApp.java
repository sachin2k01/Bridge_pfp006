import java.util.Scanner;

public class CarsApp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome!!");
        System.out.println("enter the car list size");
        int size=sc.nextInt();
        Cars car[]=new Cars[size];
        Functions f= new Functions();
        while (true)
        {
            System.out.println("Enter 1. for Adding Car Details");
            System.out.println("Enter 2. for Display car detail");
            System.out.println("Enter 3. for Search Car");
            System.out.println("Choose an Option");
            int op=sc.nextInt();
            switch (op)
            {
                case 1:
                    f.AddCar(car);
                    break;
                case 2:
                    System.out.println("Cars Present in the Lot Are: ");
                    f.Display(car);
                    break;
                case 3:
                    f.Search(car);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}


