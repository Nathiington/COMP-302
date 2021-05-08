package Linked_List;
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
        System.out.println("Nodes of linked list: ");
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
        Node temporary;
        Node newNode = new Node(data);

        if(head == null)
        {
            //If list is empty, both head and tail will point to the new node
            head = newNode;
            tail = newNode;
        }
        else
        {
            //here we input the position of our new node in the array
            System.out.println("Insert into which position?");
            int position = scanf.nextInt();
            //Node temporary points to the head
            temporary = head;
            current = null;

            //Map through the list until the position is reached
            for (int i = 0; i<position-1 ;i++)
            {
                //Node current will point to temporary
                current = temporary;
                //Node temporary will point to the next node
                temporary = temporary.next;
            }

            //current node will point to new Node
            current.next = newNode;
            //new Node will point to temporary
            newNode.next = temporary;
        }
    }

    //this will delete a node based on the value of the node
    public void deleteNode(int deleteValue)//deleteValue is the value of the node which we want to delete
    {
        Node temporary = head;
        Node prev = null;

        //If we're deleting the head
        if(temporary != null && temporary.value == deleteValue)
        {
            head = temporary.next; //changing the head to the next Node
            return;
        }

        // Searching for the value to be deleted, keep track of
        // the previous node as we need to change temporary.next
        while (temporary != null && temporary.value != deleteValue) {
            prev = temporary;
            temporary = temporary.next;
        }

        // If key was not present in linked list
        if (temporary == null)
            return;

        // Meaning temporary.next == null therefore the tail so
        // so the previous node next address now equals null therefore making it the new tail
        prev.next = temporary.next;
    }

    //this will allow the user to edit the value of a specific node based on the value that we want to edit
    public void editNode(int editValue)//editValue is the value that you want to edit
    {
        Node temporary = head;

        //If we're editing the head
        if(temporary != null && temporary.value == editValue)
        {
            System.out.println("Insert new value");
            int newValue = scanf.nextInt();
            temporary.value = newValue;
            return;
        }

        //this will map through the linked list until it reaches the element with the value we want to edit
        while (temporary.next != null)
        {
            temporary = temporary.next;

            //this will confirm if the value we want is indeed where we ended up stopping in the mapping part and will give prompt to insert a new value
            if(temporary.value == editValue)
            {
                System.out.println("Insert new value");
                int newValue = scanf.nextInt();
                temporary.value = newValue;
                return;
            }
            //this will check if we are in the tail and since we do not have the same value(as it the previous condition would have run) we can say that there is no value in the linked list
            else if ( temporary.next == null)
            {
                System.out.println("No such value in the linked list");
                return;
            }
        }

    }

}
