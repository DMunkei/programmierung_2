package LE02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Iterator1dArrayTest
{
    static Integer[] a ={1,2,3,4,5};
    static String[] words = {"a","b","c","d","e"};

    @Test
    void testStartIndex()
    {
        int start = 2;
        Iterator1dArray<String> iterator = new Iterator1dArray<String>(words,start);
        while (iterator.hasNext())
        {
            assertEquals(start,iterator.next(),"That's not the start index!");
            start++;
        }
    }

    @Test
    void testEndIndex()
    {
        int start = 2;
        Iterator1dArray<String> iterator = new Iterator1dArray<String>(words,start,6);
        int counter=0;
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            counter++;
        }
        assertEquals(words[counter],"c","That's not the last index");
    }


}
