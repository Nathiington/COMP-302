package Linked_List;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        LinkList mylist = new LinkList();
        Scanner scanf = new Scanner(System.in);

        Node head = null;
        Node tail = null;
        mylist.addNode(2);
        mylist.addNode(7);
        mylist.addNode(22);
        mylist.addNode(12);
        mylist.addNode(5);

        mylist.display();
        System.out.println("Which value would you like to enter?");
        int x = scanf.nextInt();
        mylist.insertSomewhere(x);
        mylist.display();
        System.out.println("Which value would you like to delete?");
        x = scanf.nextInt();
        mylist.deleteNode(x);
        mylist.display();
        System.out.println("Which value would you like to edit?");
        x = scanf.nextInt();
        mylist.editNode(x);
        mylist.display();
    }
}
