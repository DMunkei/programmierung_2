package LE01;

public abstract class Gericht
{
    private String course ="";
    private int price = 0;

    public Gericht()
    {
        ;
    }


    /***
     * Generic method that takes two meals and returns the first meal regardless which one is more expensive
     * @param meal1
     * @param meal2
     * @param <T>
     * @return first argument
     */

    public static <T> T getMoreExpensive(T meal1, T meal2)
    {
        return meal1;
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
