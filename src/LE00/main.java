package LE00;

import LE01.*;
import LE04.Apfelbaum;
import LE04.GroupOfFourGerichte;
import LE04.MyUtil;

public class main
{

    public static void main(String[] args) throws TableSpaceOutOfBoundsException
    {

        Pizza[] pizzas = {new Pizza(10,10),
                new Pizza(10,40),
                new Pizza(10,30),
                new Pizza(10,20)};
        GroupOfFourGerichte<Pizza> P = new GroupOfFourGerichte<>(pizzas);

        System.out.println(P.totalPrice());

        Salat p1 = new Salat(5,10);
        Pizza p2 = new Pizza(2,20);

        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p1));


        GroupOfFourGeneric<Pizza> pizzaGroupOfFourGeneric = new GroupOfFourGeneric<>();


        pizzaGroupOfFourGeneric.appendLast(new Pizza(100,10));
        pizzaGroupOfFourGeneric.appendLast(new Pizza(20,10));
        pizzaGroupOfFourGeneric.appendLast(new Pizza(30,10));
        pizzaGroupOfFourGeneric.appendLast(new Pizza(40,10));

        System.out.println(p1.compareTo(p2));

        MyUtil m = new MyUtil();
        m.max(pizzaGroupOfFourGeneric);


        //This won't get accepted since it doesnt extend Gericht
        //GroupOfFourGerichte<Apfelbaum> A = new GroupOfFourGerichte<Apfelbaum>();

    }
}
