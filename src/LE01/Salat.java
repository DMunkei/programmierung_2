package LE01;

public class Salat extends Gericht implements Comparable<Gericht>
{
    private int weight = 0;

    public Salat()
    {
    }

    public Salat(int p, int weight)
    {
        super("1 - Vorspeise",p);
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

    @Override
    public int compareTo(Gericht o)
    {
        int nameComparison = this.getCourse().compareTo(o.getCourse());
        return (nameComparison != 0) ? nameComparison : this.getPrice() - o.getPrice();
    }
}
