package Lab2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tester
{
    public static void main(String[] args)
    {
        //Creating Student objects with default Name and age
        //Modules ArrayList is created but not part of the constructor as we need to input individual modules
        Student a = new Student("John Smith",22);
        Student b = new Student("Joe Smith", 21);
        Student c = new Student("Jane Smith", 20);

/********************************  ARRAYLIST SEGMENT  **********************************************/

        //Inputting modules for each student
        a.setModules("COMP 302");
        a.setModules("COMP 303");
        a.setModules("COMP 304");

        b.setModules("COMP 202");
        b.setModules("COMP 203");
        b.setModules("COMP 204");

        c.setModules("COMP 102");
        c.setModules("COMP 103");
        c.setModules("COMP 104");

        //Creating an Arraylist for Students and adding the created Students above to that ArrayList
        ArrayList <Student> sl = new ArrayList<Student>();
        sl.add(a);
        sl.add(b);
        sl.add(c);

       // Displaying all the details for the students
        for (Student x: sl)
        {
            System.out.println("Student: "+ x);
            System.out.println("");
        }


/********************************  STACK SEGMENT  **********************************************/
        //Creating a stack instance and making it specific to the Student object
        Stack<Student> st = new Stack();

        //push() adds an object to the top of the stack
        st.push(a);
        st.push(b);
        st.push(c);

        //empty() checks if the stack in question is empty or whether it contains objects
//        if (st.empty())
//        {
//            System.out.println("No elements");
//        }
//        else
//        {
//            System.out.println("There are elements");
//        }
        //pop() will remove the element at the top of the stack (i.e. the last object entered into the stack)
//        st.pop();
        //peek() will look at the top of the stack but not remove it from the stack
        //this is why we use it here to check the value at the top of the stack after we removed the object at the top of the stack
//        System.out.println(st.peek().getName());
        //search() will look for the object given and
        //System.out.println(st.search(b));

/********************************  QUEUE SEGMENT  **********************************************/
        // creating a Queue instance and making it specific to the student object
        Queue<Student> q1 = new LinkedList<Student>();
        //Adding objects to the queue
        q1.add(a);
        q1.add(b);
        q1.add(c);

        //peek() operates the same way as the stack peek(), it retrieves the first element (in this case the first element entered)
        //System.out.println(q1.peek().getName());

    }
}
