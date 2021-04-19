package Lab3;

import java.util.*;

public class Exercise2
{
    public static void main(String[] args)
    {
        //2.1
        int[] A = {22, 45, 33, 66, 55, 34, 77};
        int[] B = {33, 2, 83, 45, 3, 12, 55};

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        //2.2
        for (int x: A)
        {
            set1.add(x);
        }
        for (int x: B)
        {
            set2.add(x);
        }
        //2.3
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("Union: "+union);
        //2,4
        Set<Integer> intersection = new HashSet<Integer>();
        for (int x:union)
        {
            if (set1.contains(x) && set2.contains(x))
            {
                intersection.add(x);
            }
        }
        System.out.println("Intersection: "+intersection);
        //2.5
        Set<Integer> difference = new HashSet<Integer>();
        for (int x:union)
        {
            if ((!set1.contains(x) && set2.contains(x)) || (set1.contains(x) && !set2.contains(x)))
            {
                difference.add(x);
            }
        }
        System.out.println("Difference: "+difference);
    }
}
