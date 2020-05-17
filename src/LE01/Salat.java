package LE01;

public class Salat extends Gericht
{
    private int weight = 0;

    public Salat()
    {
    }

    public Salat(int p, int weight)
    {
        super("salat",p);
        this.weight = weight;
    }


    public int getWeight()
    {
        return weight;
    }


    public void setWeight(int weight)
    {
        this.weight = weight;
    }


    @Override
    public String toString()
    {
        return "Salat{weight=" + weight + "Price is: " + getPrice()+ '}';
    }
}
