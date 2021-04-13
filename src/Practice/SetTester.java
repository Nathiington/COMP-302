//this is just a practice class for sets and maps

package Practice;

import java.util.*;

public class SetTester
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        String a = "Nate";
        String b = "Nathan";
        String c = "Nathiignton";
        String d = "Nath";

        //Creating a hashset of Strings
        Set<String> myset = new HashSet<>();
// adding objects to the set
        myset.add(a);
        myset.add(b);
        myset.add(c);
        myset.add(d);
//        outputting each name using for each loop
//        for (String s: myset)
//        {
//            System.out.println(s);
//        }

//        Map works such that you have to declare Map<key, value>. This is the way you declare a map for string values
//        e.g. how we used student ID as our key and the name as the value as a real life use case
        Map<Integer, String> mymap = new TreeMap<Integer, String>();

        //put = add
        mymap.put(1041,"Nathan");
        mymap.put(1080,"Thembi");
        mymap.put(1047,"Ricardo");

        //This will get the name based on the ID entered
        System.out.println("Enter student ID");
        int x = scanf.nextInt();
        System.out.println(mymap.get(x));
    }
}
