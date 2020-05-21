package LE04;

import LE01.Gericht;
public class GroupOfFourGerichte<T extends Gericht>
{

    private int size = 0;
    protected T ersterPlatz;
    protected T zweiterPlatz;
    private T dritterPlatz;
    private T vierterPlatz;

    public GroupOfFourGerichte(T[] meals)
    {
        this.ersterPlatz = meals[0];
        this.zweiterPlatz = meals[1];
        this.dritterPlatz = meals[2];
        this.vierterPlatz = meals[3];
        size=4;
    }

    public double totalPrice()
    {
        double sum = 0;
        sum += (ersterPlatz.getPrice() + zweiterPlatz.getPrice() +dritterPlatz.getPrice()+ vierterPlatz.getPrice());
        return sum;
    }


}
