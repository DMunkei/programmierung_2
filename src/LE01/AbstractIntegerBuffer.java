package LE01;

public abstract class AbstractIntegerBuffer implements IntegerBuffer
{
    protected int size = 0;
    protected Integer[] array;
    @Override
    public void push(Integer i)
    {
        try
        {
            this.array[size] = i;
            this.size++;
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
    /***
     * The maximum size of the stack
     * @return integer
     */
    @Override
    public int capacity()
    {
        return this.array.length;
    }

    /***
     * Returns how many indices have been used.
     * @return
     */
    @Override
    public int size()
    {
        return this.size;
    }
}
