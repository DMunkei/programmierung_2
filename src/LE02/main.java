package LE02;

import LE03.*;

import java.awt.*;

public class main
{
    public static void main(String[] args) throws TableSpaceOutOfBoundsException
    {
        /*Pizza p = new Pizza(10, 30);
        Pizza pizzas[] = {new Pizza(10,10), new Pizza(10,10), new Pizza(10,10), new Pizza(10,10)};
        GroupOfFourGeneric<Pizza> PizzaGR = new GroupOfFourGeneric<>(pizzas);
        for (int i = 1; i < 5; i++)
        {
            System.out.println(PizzaGR.get(i));
        }
        GroupOfFourGeneric<Gericht> Gerichte = new GroupOfFourGeneric<>(pizzas);
        Gerichte.removeLast();
        Gerichte.appendLast(new Salat(10,10));
        System.out.println(Gerichte.get(4));*/

       /* ComparatorPizzaDiameter pcp = new ComparatorPizzaDiameter(new Pizza(10,10), new Pizza(20,20));
        ComparatorGerichtPrice gcp = new ComparatorGerichtPrice(new Salat(23,30),new Pizza(20,20));
        ComparatorSalatWeight scp = new ComparatorSalatWeight(new Salat(10,40), new Salat(20,40));

        System.out.println(gcp.compare(gcp.getG1(),gcp.getG2()));
        System.out.println(pcp.compare(pcp.getP1(),pcp.getP2()));
        System.out.println(scp.compare(scp.getS1(),scp.getS2()));

        String x = "HalloWest";
        String y = "HALLOMeineLieben";
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(x.hashCode()-y.hashCode());
        System.out.println(y.hashCode()-x.hashCode());

        MyUtil myUtil = new MyUtil();
        String[] words = {"Hello","rld", "a","longerword","", "bcd","evenlongerword"};
        ComparatorStringLength s = new ComparatorStringLength();
        System.out.println(MyUtil.max(words, s));
        Gericht[] meals = {
                new Pizza(0,20),
                new Salat(0,30),
                new Pizza(0,50),
                new Pizza(0,0),
                new Pizza(00,200),
        };
        ComparatorGerichtPrice g = new ComparatorGerichtPrice();
        System.out.println(MyUtil.max(meals,g));*/

       String[] a ={"a","b","c","d"};
       Iterator1dArray<String> iterator = new Iterator1dArray<>(a);
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}
