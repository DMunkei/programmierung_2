package LE01;

import java.util.Random;

public class FIFO implements IntegerBuffer
{
    /***
     * Attributes
     */
    private Integer array[];
    private int size;
    private int lastIndexUsed=0;

    /***
     * LIFO Constructor that takes a size to decide how big the Stack will be
     * @param size
     */
    public FIFO(int size)
    {
        this.size = size;
        this.array = new Integer[size];
    }

    /***
     * Constructor without a parameter, the size needs to be a random value between 3 and above [3..n]
     */
    public FIFO()
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
            this.array[lastIndexUsed] = i;
            this.lastIndexUsed++;
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public Integer pop()
    {
        if(lastIndexUsed == 0) return null;
        Integer output = this.array[0];
        Integer arrayLength = this.array.length;
        Integer newArray[] = new Integer[arrayLength];
        for (int i = 1; i < arrayLength; i++)
        {
            if(this.array[i] == null) break;
           newArray[i-1] = this.array[i];
        }
        this.lastIndexUsed--;
        this.array = newArray;
        return  output;
    }
    public int size(){return lastIndexUsed;}

    public int capacity()
    {
        return this.size;
    }


    public static void main(String[] args)
    {
        FIFO f = new FIFO(4);
        System.out.println(f.pop());
        f.push(1);
        f.push(2);
        f.push(3);
        f.push(4);


        FIFO f2 = new FIFO();

        f2.push(1);
        f2.push(2);
        f2.push(3);
        f2.push(4);
        f2.push(5);


        System.out.println("f size: " +f.size());
        System.out.println("f cap: " +f.capacity());
        System.out.println("f2 size: " +f2.size());
        System.out.println("f2 cap: " +f2.capacity());
    }
}
