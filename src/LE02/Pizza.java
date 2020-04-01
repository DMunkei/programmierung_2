package LE02;

public class Pizza extends Gericht
{
    private int diameter = 0;

    public Pizza()
    {
        ;
    }

    public Pizza(int p, int d)
    {
        super("pizza",p);
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
        return "Pizza{" +
                "diameter=" + diameter +
                '}';
    }
}
