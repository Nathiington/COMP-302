package Submission1;

public class Tester
{
    public static void main(String[] args)
    {
        LinkList mylist = new LinkList();

        Node head = null;
        Node tail = null;
        mylist.addNode(2);
        mylist.addNode(7);
        mylist.addNode(22);
        mylist.addNode(12);
        mylist.addNode(5);

        mylist.display();
        mylist.insertSomewhere(100);
        mylist.display();
        mylist.deleteNode(7);
        mylist.display();
        mylist.editNode(22);
        mylist.display();
    }
}
