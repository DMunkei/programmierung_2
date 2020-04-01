package LE01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FIFOTest
{
    FIFO f = null;
    static Integer[] a ={1,2,3,4,5};
    @BeforeEach
    void setup()
    {
        f = new FIFO(5);
    }

    @AfterEach
    void teardown()
    {
        f = null;
    }

    @Test
    void testPushPop()
    {
        for (Integer i : a)
        {
            f.push(i);
            assertEquals(i,f.pop(),"Oops, wrong Pop");
        }
    }

    @Test
    void testCapacity()
    {
        int size = 0;
        for (Integer i : a)
        {
            f.push(i);
            assertEquals(5,f.capacity(),"Wrong capacity!");
        }
    }

    @Test
    void testSize()
    {
        int size = 0;
        for (Integer i : a)
        {
            f.push(i);
            assertEquals(i,f.size(),"Wrong capacity!");
        }
    }
}