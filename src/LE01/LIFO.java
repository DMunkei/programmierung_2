package LE01;
/***
 * Author Dominique Köstler
 */
import java.util.Random;
public class LIFO extends AbstractIntegerBuffer
{

    /***
     * LIFO Constructor that takes a size to decide how big the Stack will be
     * @param size
     */
    public LIFO(int size)
    {
        this.array = new Integer[size];
    }

    /***
     * Constructor without a parameter, the size needs to be a random value between 3 and above [3..n]
     */
    public LIFO()
    {
        Random randomSize = new Random();
        int size = 0;
        do
        {
            size = randomSize.nextInt(101);
        } while (size<=3);
        this.array = new Integer[size];
    }


    @Override
    public Integer pop()
    {
        if(size == 0) return null;
        Integer number = -1;
        try
        {
            this.size--;
            number = this.array[size];
            this.array[size] = null;
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        return number;
    }


    @Override
    public String toString()
    {
        return "LIFO{"+"size=" + size + '}';
    }

    public static void main(String[] args)
    {
        LIFO l = new LIFO(5);
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
