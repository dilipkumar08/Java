

public class Main
{
    public static void main(String[] args)
    {
        int i=20;
        Car c=new Car();
        c.seta(i);
        c.prt();
    }
}
    
class Car
{
    private int a=10;
    public int geta()
    {
        return a;
    }
    public void seta(int b)
    {
        this.a=b;
    }
    public void prt()
    {
        System.out.println(a);
    }
}
