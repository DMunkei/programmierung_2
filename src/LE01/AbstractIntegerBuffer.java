package LE01;

public abstract class AbstractIntegerBuffer implements IntegerBuffer
{
    protected int size = 0;
    protected Integer[] array;

    @Override
    public void push(Integer integer)
    {

    }

    @Override
    public int capacity()
    {
        return 0;
    }

    @Override
    public int size()
    {
        return 0;
    }
}
