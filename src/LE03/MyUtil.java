package LE03;

import LE02.Gericht;
import LE02.GroupIF;
import LE02.Pizza;

import java.util.Comparator;

public class MyUtil
{

    /***
     * Compares all of the words in an array by length and returns the longest word.
     * @param words
     * @param x
     * @return longest word
     */
    public static String max(String[] words, ComparatorStringLength x)
    {
        if(words.length == 0) return words[0];
        int resultIndex = 0;
        int counter = 1;
        for (int i = 0; i < words.length - 1; i++)
        {
            if (x.compare(words[resultIndex], words[resultIndex + counter]) < 0)
            {
                resultIndex += counter; //Setting new max
                counter = 1; //Reseting the counter back to the starting point.
            } else
            {
                counter++;
            }
        }
        return words[resultIndex];
    }

    public static Gericht max(Gericht[] meals, Comparator<Gericht> x)
    {
        if(meals.length == 0) return meals[0];
        int resultIndex = 0;
        int counter = 1;
        for (int i = 0; i < meals.length - 1; i++)
        {
            if (x.compare(meals[resultIndex], meals[resultIndex + counter]) < 0)
            {
                resultIndex += counter;// setting new max
                counter = 1; //Reseting the counter back to the starting point.
            } else
            {
                counter++;
            }
        }
        return meals[resultIndex];
    }

    //TODO Don't get understand the question in the Task...
    public static Gericht max(GroupIF<Gericht> meals, ComparatorGerichtPrice x)
    {
        return new Pizza(10,10);
    }

    public void printAll(IteratorGericht<Gericht> meals)
    {
        while (meals.hasNext())
        {
            System.out.println(meals.next());
        }
    }

    public void printAll(IteratorGericht<Gericht> meals1, IteratorGericht<Gericht> meals2)
    {
        while (meals1.hasNext() && meals2.hasNext())
        {

            System.out.println("1: " + meals1.next() + " 2: " + meals2.next() + "\n");
        }
    }

}
