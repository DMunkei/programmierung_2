package LE01;

public class  Helper
{
    public static void move(IntegerBuffer source, IntegerBuffer sink)
    {
        while (source.size() != 0)
        {
            sink.push(source.pop());
        }
    }
}
