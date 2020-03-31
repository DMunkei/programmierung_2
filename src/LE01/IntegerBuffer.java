package LE01;
/***
 * Author Dominique Köstler
 */
public interface IntegerBuffer
{
    public void push(Integer integer);
    public Integer pop();
    public int size();
    public int capacity();
}
