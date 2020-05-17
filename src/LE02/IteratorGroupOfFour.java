package LE02;

import LE01.GroupOfFourGeneric;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorGroupOfFour<E> implements Iterator<E>
{
    private GroupOfFourGeneric GOF;
    private int start;
    private int end;

    public IteratorGroupOfFour(GroupOfFourGeneric group)
    {
        this.start = 1;
        this.end = group.size();
        this.GOF = group;
    }

    @Override
    public boolean hasNext()
    {
        return start <= GOF.size();
    }

    @Override
    public E next()
    {
        if (this.hasNext())
        {
            return (E) GOF.get(start++);
        }
        else
        {
            throw new NoSuchElementException();
        }
    }
}
