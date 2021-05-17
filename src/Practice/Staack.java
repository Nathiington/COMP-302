package Practice;

import java.util.*;

public class Staack
{
    public static void main(String[] args)
    {
//        creating a Stack object
//        Stack is last in first out
        Stack st = new Stack();
// push() is the same as add(). It adds an item to our list
        st.push("Baby");
        st.push("Baby2");
        st.push("Baby3");
        st.push("Baby4");

//      pop() will return the value of the first object in the stack and then remove that object from the stack
        System.out.println(st.pop());
//      peek() will only return the value of the first item without removing it
        System.out.println(st.peek());
//      search() will return the index of the value input as a parameter
        System.out.println(st.search("Baby3"));


    }
}
