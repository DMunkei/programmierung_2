package LE02;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterator1dArray<E> implements Iterator<E>
{
    private int start;
    private int end;
    private E[] elements;

    /***
     * A Constructor that wasn't given a start or end index.
     * @param elements
     */
    public Iterator1dArray(E[] elements)
    {
        this.start = 0;
        this.end = elements.length;
        this.elements = elements;
    }

    /***
     * Constructor with a start index
     * @param start
     * @param elements
     */
    public Iterator1dArray(E[] elements,int start)
    {
        this.start = start-1;
        this.elements = elements;
        this.end = elements.length;
    }

    /***
     * Start and end index given
     * @param start
     * @param end
     * @param elements
     */
    public Iterator1dArray(E[] elements,int start, int end)
    {
        this.start = start-1;
        this.end = end-1;
        //TODO Should I catch an index out of bound or should i just ignore it?
        this.elements = elements;

    }

    @Override
    public boolean hasNext()
    {
        return start < end;
    }

    @Override
    public E next()
    {
        //When is it smart to use a try catch or a if?
        try
        {
            this.hasNext();
        }
        catch (NoSuchElementException e)
        {
            throw new NoSuchElementException();
        }
        return elements[start++]; //gets the current element and increments the counter
    }
}
