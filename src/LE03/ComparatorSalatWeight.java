package LE03;

import LE02.Salat;

import java.util.Comparator;

public class ComparatorSalatWeight implements Comparator<Salat>
{
    private Salat s1;
    private Salat s2;

    public ComparatorSalatWeight(Salat s1, Salat s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    public Salat getS1()
    {
        return s1;
    }

    public Salat getS2()
    {
        return s2;
    }

    @Override
    public int compare(Salat o1, Salat o2)
    {
        return o1.getWeight()-o2.getWeight();
    }
}
