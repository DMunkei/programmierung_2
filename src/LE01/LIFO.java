package LE01;

import java.util.Random;
public class LIFO implements IntegerBuffer
{
    /***
     * Attributes
     */
    private Integer array[];
    private int size;
    private int lastUsedIndex = 0;

    /***
     * LIFO Constructor that takes a size to decide how big the Stack will be
     * @param size
     */
    public LIFO(int size)
    {
        this.size = size;
        this.array = new Integer[size];
    }

    /***
     * Constructor without a parameter, the size needs to be a random value between 3 and above [3..n]
     */
    public LIFO()
    {
        Random randomSize = new Random();
        do
        {
            this.size = randomSize.nextInt(100);
        } while (this.size<=3);
        this.array = new Integer[this.size];
    }

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

    public Integer pop()
    {
        if(lastUsedIndex == 0) return null;
        Integer number = -1;
        try
        {
            this.lastUsedIndex--;
            number = this.array[lastUsedIndex];
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        return number;
    }

    /***
     * Returns how many indices have been used.
     * @return
     */
    public int size()
    {
        return this.lastUsedIndex;
    }

    /***
     * The maximum size of the stack
     * @return integer
     */
    public int capacity()
    {
        return this.size;
    }
    @Override
    public String toString()
    {
        return "LIFO{"+"size=" + size + '}';
    }

    public static void main(String[] args)
    {
        LIFO l = new LIFO(5);
/*        System.out.println("The size before adding: " +l.size());
        for (int i = 0; i < l.capacity(); i++)
        {
            l.push(i);
        }
        System.out.println("The size after adding: " +l.size());
        for (int i = 0; i < l.capacity(); i++)
        {
            System.out.println(l.pop());
        }*/
        System.out.println(l.size());
        l.push(1);
        l.push(1);
        l.push(1);
        l.push(1);
        l.push(1);
        l.push(1);
        System.out.println(l.size());
        l.pop();
        l.pop();
        System.out.println(l.size());
        l.push(1);
        l.push(1);
        l.push(1);
        System.out.println(l.size());



/*        System.out.println("Random Constructor test******************************************************");
        LIFO l2 = new LIFO();
        System.out.println("The size before adding: " +l2.size());
        int i = 0;
        do
        {
            l2.push(i);
            i++;
        } while (i<l2.capacity());

        System.out.println("The size before adding: " +l2.size());
        for (int j = 0; j < l2.capacity(); j++)
        {
            System.out.println(l2.pop());
        }
        System.out.println(l);
        System.out.println(l2);*/
    }

}
