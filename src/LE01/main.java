package LE01;

public class main
{
    public static void main(String[] args) throws TableSpaceOutOfBoundsException
    {

        Pizza p1 = new Pizza(10,10);
        Pizza p2 = new Pizza(10,10);
        Salat s1 = new Salat(30,10);

        Object o1 = Gericht.getMoreExpensive(p1, p2);
        Object o2 = Gericht.getMoreExpensive(p1, s1);
        Object o3 = Gericht.getMoreExpensive("Test", 5);

        Object[] objects = new Object[]{o1,o2,o3};



        System.out.println("halt");

    }
}
