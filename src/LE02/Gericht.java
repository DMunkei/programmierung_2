package LE02;

public abstract class Gericht
{
    private String course ="";
    private int price = 0;

    public Gericht()
    {
        ;
    }

    public Gericht(String s, int i)
    {
        this.course = s;
        this.price = i;
    }

    public String getCourse()
    {
        return course;
    }

    public int getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return "Gericht{" +
                "course='" + course + '\'' +
                ", price=" + price +
                '}';
    }
}
