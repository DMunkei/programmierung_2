package LE02;

public interface GroupIF<T>
{
    int size();

    boolean isEmpty();

    void appendLast(T g) throws TableSpaceOutOfBoundsException;

    T removeLast() throws TableSpaceOutOfBoundsException;

    T get(int p);

    void swap(int p1, int p2);
}
