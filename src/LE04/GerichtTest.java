package LE04;

import LE02.Pizza;
import LE02.Salat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import LE02.Gericht;
import static org.junit.jupiter.api.Assertions.*;

class GerichtTest
{
    @Test
    void getMoreExpensiveStringAndInt()
    {
        String word = "Test";
        int i = 5;
        Object result = Gericht.getMoreExpensive(word,i);
        assertNotEquals(result, i, "They're the same?!");
    }

    @Test
    void getMoreExpensivePizzaAndSalad()
    {
        Pizza pizza = new Pizza(10,10);
        Salat salad = new Salat(20,20);
        Object result = Gericht.getMoreExpensive(pizza,salad);
        assertNotEquals(result, salad, "That salad looks like a pizza...");
    }

    @Test
    void getMoreExpensivePizza()
    {
        Pizza p1 = new Pizza(10,20);
        Pizza p2 = new Pizza(30,20);
        Object result = Gericht.getMoreExpensive(p1, p2);
        assertEquals(result, p1, "This wasn't the pizza I wanted!");



    }






}