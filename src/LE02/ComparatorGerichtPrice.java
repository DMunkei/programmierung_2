package LE02;

import LE01.Gericht;

import java.util.Comparator;

public class ComparatorGerichtPrice implements Comparator<Gericht>
{
    private Gericht g1;
    private Gericht g2;

    public ComparatorGerichtPrice()
    {
    }

    public Gericht getG1()
    {
        return g1;
    }

    public Gericht getG2()
    {
        return g2;
    }

    public ComparatorGerichtPrice(Gericht g1, Gericht g2)
    {
        this.g1 = g1;
        this.g2 = g2;
    }

    /***
     * Compares the 2 classes properties and returns the bigger of the two
     * @param o1
     * @param o2
     * @return If the value of o1 is bigger than o2 then the value will be greater than 0 otherwise less than 0
     * or 0 when both are equal.
     */
    @Override
    public int compare(Gericht o1, Gericht o2)
    {
        return o1.getPrice() - o2.getPrice();
    }
}
