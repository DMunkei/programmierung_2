package LE01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupOfFourGenericTest
{
    GroupOfFourGeneric GOF = null;
    Gericht[] gerichts = new Gericht[4];
    Pizza p = new Pizza(10,10);
    Pizza p2 = new Pizza(20,20);
    @BeforeEach
    void setUp() throws TableSpaceOutOfBoundsException
    {
       GOF = new GroupOfFourGeneric();
    }
    @AfterEach
    void tearDown()
    {
        GOF = null;
    }
    @Test
    void testAppendLast() throws TableSpaceOutOfBoundsException
    {
        for (int i = 0; i < gerichts.length; i++)
        {
            gerichts[i] = p;
            GOF.appendLast(p);
            assertEquals(p,GOF.ersterPlatz);
        }
        assertEquals(p,GOF.ersterPlatz,"MY PIZZA IS NOT THE SAME!");
    }

    @Test
    void testSwap() throws  TableSpaceOutOfBoundsException
    {
        GOF.appendLast(p);
        GOF.appendLast(p2);
        GOF.swap(1,2);
        assertEquals(p2,GOF.ersterPlatz,"Swapped something wrong woops!");

    }

    @Test
    void testMealMixing() throws TableSpaceOutOfBoundsException
    {
        Salat[] salads = {new Salat(10,10)};
        GroupOfFourGeneric<Salat> saladMeals  = new GroupOfFourGeneric<>(salads);
        saladMeals.appendLast(salads[0]);
        assertEquals(saladMeals.get(2),salads[0],"This isn't a salad!");
    }

    @Test
    void testMeals() throws TableSpaceOutOfBoundsException
    {
        GroupOfFourGeneric<Gericht> meals = new GroupOfFourGeneric<>();
        meals.appendLast(new Pizza(10, 10));
        meals.appendLast(new Salat(10, 10));
        assertNotEquals(meals.get(1), meals.get(2), "These two are the same!");
    }

    @Test
    void testSize() throws TableSpaceOutOfBoundsException
    {
        for (int i = 0; i < 4; i++)
        {
            GOF.appendLast(p);
        }
        assertEquals(4,GOF.size(),"TOO MANY DISHES!");
    }

    @Test
    void testRemoveLast() throws TableSpaceOutOfBoundsException
    {
        for (int i = 0; i < 4; i++)
        {
            GOF.appendLast(p);
        }
        GOF.removeLast();
        assertEquals(null,GOF.get(4),"Failed removing last item from class");
    }
    @Test
    void testClear()
    {
        GOF.clear();

        assertEquals(0,GOF.size(),"The Group is not empty");
    }

    @Test
    void testGet() throws TableSpaceOutOfBoundsException
    {
        for (int i = 0; i < 3; i++)
        {
            GOF.appendLast(p);
        }
        assertEquals(GOF.zweiterPlatz,GOF.get(2),"Getting the wrong meal");
        assertEquals(null,GOF.get(4),"Getting the wrong meal");
    }

    @Test
    void testIsEmpty() throws TableSpaceOutOfBoundsException
    {

        for (int i = 0; i < 4; i++)
        {
            GOF.appendLast(p);
            assertEquals(true ,GOF.isEmpty(),"Not Empty");
        }
    }

}