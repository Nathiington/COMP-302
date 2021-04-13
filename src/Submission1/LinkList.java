package Submission1;
import java.util.*;

public class LinkList
{
    Scanner scanf = new Scanner(System.in);
    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //this will add a new node to the list
    public void addNode(int data)
    {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null)
        {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    //this will display all the nodes present in the list
    public void display()
    {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null)
        {
            //Prints each node by incrementing pointer
            System.out.println(current.value + " ");
            current = current.next;
        }
        System.out.println();

    }

    //this will insert a new node to the linked list at a specified location
    public void insertSomewhere(int data)
    {

        Node current;
        Node temp;
        Node newNode = new Node(data);

        if(head == null)
        {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else
        {
            //here we input the position of our new node in the array
            System.out.println("Insert into which position?");
            int position = scanf.nextInt();
            //Node temp points to the head
            temp = head;
            current = null;

            //Map through the list until the position is reached
            for (int i = 0; i<position-1 ;i++)
            {
                //Node current will point to temp
                current = temp;
                //Node temp will point to the next node
                temp = temp.next;
            }

            //current node will point to new Node
            current.next = newNode;
            //new Node will point to temp
            newNode.next = temp;
        }
    }

    //this will delete a node based on the value of the node
    public void deleteNode(int deleteValue)//deleteValue is the value of the node which we want to delete
    {
        Node temp = head;
        Node prev = null;

        //If we're deleting the head
        if(temp != null && temp.value == deleteValue)
        {
            head = temp.next; //changing the head to the next Node
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.value != deleteValue) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    //this will allow the user to edit the value of a specific node based on the value that we want to edit
    public void editNode(int editValue)//editValue is the value that want to edit
    {
        Node temp = head;

        //If we're editing the head
        if(temp != null && temp.value == editValue)
        {
            head = temp.next; //changing the head to the next Node
            return;
        }

        //this will map through the linked list until it reaches the element with the value we want to edit
        while (temp.next != null)
        {
            temp = temp.next;

            //this will confirm if the value we want is indeed where we ended up stopping in the mapping part and will give prompt to insert a new value
            if(temp.value == editValue)
            {
                System.out.println("Insert new value");
                int newValue = scanf.nextInt();
                temp.value = newValue;
                break;
            }
            //this will check if we are in the tail and since we do not have the same value(as it the previous condition would have run) we can say that there is no value in the linked list
            else if ( temp.next == null)
            {
                System.out.println("No such value in the linked list");
            }
        }

    }

}
