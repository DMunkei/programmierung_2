package LE04;

import LE01.GroupIF;

public class MyUtil
{
    public MyUtil()
    {
    }

    public <T extends Comparable> T max(GroupIF<T> item)
    {
        Object biggestItem = item.get(1);
        for (int i = 2; i <= item.size(); i++)
        {
            biggestItem = (item.get(i).compareTo(biggestItem) <= 0) ? biggestItem:item.get(i);
        }

        return (T) item;
    }
}
