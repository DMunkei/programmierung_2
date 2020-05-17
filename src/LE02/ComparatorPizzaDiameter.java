package LE02;

import LE01.Pizza;

import java.util.Comparator;

public class ComparatorPizzaDiameter implements Comparator<Pizza>
{
    private Pizza p1;
    private Pizza p2;

    public ComparatorPizzaDiameter(Pizza p1, Pizza p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Pizza getP1()
    {
        return p1;
    }

    public Pizza getP2()
    {
        return p2;
    }

    @Override
    public int compare(Pizza o1, Pizza o2)
    {
        return o1.getDiameter()-o2.getDiameter();
    }
}
