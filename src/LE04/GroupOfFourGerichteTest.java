package LE04;

import LE01.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupOfFourGerichteTest
{

    static Pizza[] pizzas = new Pizza[4];
    void setup()
    {
        pizzas[0] = new Pizza(10,10);
        pizzas[1] = new Pizza(20,10);
        pizzas[2] = new Pizza(100,10);
        pizzas[3] = new Pizza(120,10);
    }


    @Test
    void testTotalPrice()
    {

        GroupOfFourGerichte<Pizza> px = new GroupOfFourGerichte<>(pizzas);
    }
}