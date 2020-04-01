package LE02;

public interface GroupIF
{
    int size();

    boolean isEmpty();

    void appendLast(Gericht g) throws TableSpaceOutOfBoundsException;

    Gericht removeLast() throws TableSpaceOutOfBoundsException;

    Gericht get(int p);

    void swap(int p1, int p2);
}
