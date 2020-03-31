package LE01;
/***
 * Author Dominique Köstler
 */
public abstract class AbstractIntegerBuffer implements IntegerBuffer
{
    protected int size = 0;
    protected Integer[] array;
    protected int lastUsedIndex = 0;

    @Override
    public void push(Integer i)
    {
        try
        {
            this.array[lastUsedIndex] = i;
            this.lastUsedIndex++;
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
        return this.size;
    }

    /***
     * Returns how many indices have been used.
     * @return
     */
    @Override
    public int size()
    {
        return this.lastUsedIndex;
    }
}
