package LE02;

public class main
{
    public static void main(String[] args) throws TableSpaceOutOfBoundsException
    {
        Pizza p = new Pizza(10, 30);
        GroupOfFour g = new GroupOfFour();
        g.appendLast(p);
        g.appendLast(p);
        g.appendLast(p);
        g.appendLast(p);
        g.appendLast(p);
    }
}
