package Practice;

import java.util.ArrayList;

public class Arrayist
{
    public static void main(String[] args)
    {
//        Creating an ArrayList object
       ArrayList<Student> arr = new ArrayList <Student>();

       Student b = new Student (1800901, "Letty");
       Student a = new Student (180011, "Letoya");
       Student c = new Student (1800321, "Latoya");
       Student d = new Student (1800661, "Lerato");

// You can add the object
       arr.add(b);
       arr.add(a);
//       You can also add the object with a specific index for that object to go to
       arr.add(0,c);
       arr.add(d);
// Empties the entire ArrayList
       arr.clear();
// Returns true if the ArrayList is empty and false if it is not empty
        arr.isEmpty();
//Checks if the ArrayList contains a specific object
        arr.contains(b);
//You can remove an object at a specific index
        arr.remove(2);
//        You can remove a specific object
        arr.remove(a);

// get() will return the object at that specific index
        System.out.println(arr.get(2));
       System.out.println(arr);


    }
}
