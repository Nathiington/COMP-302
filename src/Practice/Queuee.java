package Practice;

import java.util.*;

public class Queuee
{
    public static void main(String[] args)
    {
//        A Queue is not like an object so you cannot create it
//        You can use it as in interface
//        Queue is last in first out
        Queue ass = new LinkedList();
//      Adding objects to our queue
//      add() and offer() are the same
//      offer() returns true if the object was added to the queue while add() does not
        ass.add("String");
        ass.offer("baby");
        ass.add("lovie");
        ass.add("sweetie");
// remove() and poll() are the same they both remove the first object in the queue
// The difference is poll() returns null if the queue is empty while remove() returns nothing
       ass.remove();
        ass.poll();

//      peek() and element() are the same
        // The difference is peek() returns null if the queue is empty while element() returns nothing
        System.out.println(ass.peek());
        System.out.println( ass.element());


        System.out.println(ass);


    }
}
