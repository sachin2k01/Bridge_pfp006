import java.util.Scanner;
public class Functions
{
    Scanner sc=new Scanner(System.in);
    public void AddCar(Cars car[])
    {
        int c=1;
        for(int i=0;i<car.length;i++)
        {
            System.out.println("Enter your "+c+ " car details");
            c++;
            System.out.println("Licence number: ");
            String licence=sc.next();
            System.out.println("Enter car color: ");
            String color=sc.next();
            System.out.println("Enter car brand: ");
            String brand=sc.next();
            car[i]=new Cars(licence,color,brand);
        }

    }

    public void Display(Cars car[])
    {
        for (int i=0;i<car.length;i++)
        {
            System.out.println(car[i]);
        }
    }

    public void Search(Cars car[])
    {
        System.out.println("Search Car By it's Licence Plate Number");
        String no=sc.next();
        for (int i=0;i<car.length;i++)
        {
            if(car[i].licenceplate.equals(no))
            {
                System.out.println("Requested Car Details Are: ");
                System.out.println("License No: "+car[i].licenceplate+ " Color: "+car[i].color+" Brand: "+car[i].brand);
            }
        }
    }

}
