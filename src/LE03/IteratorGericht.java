package LE03;

import LE02.Gericht;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorGericht<E extends Gericht> implements Iterator<Gericht>
{

    private E[] meals;
    private int start;
    private int end;

    public IteratorGericht(E[] meals)
    {
        this.meals = meals;
        this.start = 0;
        this.end = meals.length;
    }


    public boolean hasNext()
    {
        return start < meals.length;
    }


    public E next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }

        return meals[start++];
    }
}
