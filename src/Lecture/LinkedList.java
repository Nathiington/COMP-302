package Lecture;

public class LinkedList
{
    Node head = null;
    Node tail = null;

    public void addNode(int value)
    {
        Node newNode = new Node(4);

        if(head==null)
        {
           head = newNode;
           tail = newNode;
        }
        else
        {
            tail.next= newNode;
            tail = newNode;
        }
    }
    public void display()
    {
        Node current = head;

        if (head==null)
        {
            System.out.println("empty");
            return;
        }

        System.out.println("Nodes are: ");
        while (current != null)
        {
            System.out.println(current.value + " ");
            current = current.next;
            System.out.println("");
        }


    }

}
