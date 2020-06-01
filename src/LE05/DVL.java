package LE05;

public class DVL
{

    //The nodes that will represent the items inside of the linkedlist
    public static class Node{
        private Object element;
        private Node next;
        private Node previous;

        public Node (Object newElement)
        {
            this.element = newElement;
            next = null;
            previous = null;
        }
    }



}
