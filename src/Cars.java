public class Cars
{
    public String licenceplate;
    public String color;
    public String brand;

    Cars(String l,String c, String b)
    {
        this.licenceplate=l;
        this.color=c;
        this.brand=b;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "licenceplate='" + licenceplate + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

}
