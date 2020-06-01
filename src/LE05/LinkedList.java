package LE05;

public class LinkedList
{
    public static class Node()
    {
        private Object element;
        private Node next;

        public Node(Object newElement)
        {
            this.element = newElement;
            next = null;
        }
    }

    private Node head; // Just a reference onto the Head of the Node. NOT AN INSTANCE!!


    public LinkedList()
    {
        head =null;
    }

    public LinkedList(Object Element)
    {
        Node node = new Node(Element); // setting the first node of the linked list and setting the HEAD to the node
        head = node;

    }
}
