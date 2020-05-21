package LE01;

public class Pizza extends Gericht implements Comparable<Gericht>
{
    private int diameter = 0;

    public Pizza()
    {
        super("2 - Hauptspeise",10);
    }

    public Pizza(int p, int d)
    {
        super("2 - Hauptspeise",p);
        this.diameter = d;
    }


    public int getDiameter()
    {
        return diameter;
    }


    public void setDiameter(int diameter)
    {
        this.diameter = diameter;
    }

    @Override
    public String toString()
    {
        return "Pizza{diameter=" + diameter +" price: " + getPrice()+"}";
    }

    @Override
    public int compareTo(Gericht o)
    {
        int nameComparison = this.getCourse().compareTo(o.getCourse());
        return (nameComparison != 0) ? nameComparison : this.getPrice() - o.getPrice();
    }
}
