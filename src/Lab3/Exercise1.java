package Lab3;

import java.util.*;

public class Exercise1
{
    public static void main(String[] args)
    {
        //1.1
//      Declaring and initialising an array
        int []numbers = {34,22,10,60,30,22};
        //1.2
//        Creating a Set object to store Integers specifically
        Set<Integer> myset = new HashSet<Integer>();
        //1.3
//      Enhanced For Loop to add all array elements to the Set object
        for (int x: numbers)
        {
            myset.add(x);
        }
        //1.4
//        Printing the set to the console
        System.out.println("Set= ");
        System.out.println(myset);
        //1.5
        TreeSet<Integer> myset2 = new TreeSet<Integer>(myset);
        //1.6
        System.out.println("TreeSet");
        System.out.println(myset2);
        //1.7
        System.out.println("");
        System.out.println("First:");
        System.out.println(myset2.first());
        System.out.println("Last:");
        System.out.println(myset2.last());
        //1.9
        System.out.println("");
        if (myset2.size()<7)
        {
            if(myset2.first()!=myset2.last())
            {
                myset2.remove(myset2.first());
                myset2.remove(myset2.last());
                System.out.println("First != Last");
            }
            else
            {
                System.out.println("First == Last");
            }
        }
        //1.10
        if (myset2.contains(60))
        {
            myset2.clear();
            System.out.println("cleared");
        }
        else
        {
            System.out.println("Not cleared");
        }
    }
}
