package LE01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LIFOTest
{
    LIFO L = null;
    static Integer[] a = {1,2,3,4,5};
    @BeforeEach
    void setUp()
    {
        L = new LIFO(5);
    }

    @AfterEach
    void tearDown()
    {
        L = null;
    }

    @Test
    void testPopPush()
    {
        for (Integer i : a)
        {
            L.push(i);
            assertEquals(i,L.pop(),"Somethings wrong!");
        }
    }
    @Test
    void testCapacity()
    {
        int s = 0;
        for (Integer i : a)
        {
            L.push(i);
            assertEquals(5,L.capacity(),"Capacity is wrong!");
        }
    }

    @Test
    void testSize()
    {
        int size = 5;
        for (Integer i : a)
        {
            L.push(i);
            assertEquals(i,L.size(),"Wrong amount of elements in the array!");
        }
    }
}