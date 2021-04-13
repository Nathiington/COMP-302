package Practice;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester
{
    public static void main(String[] args)
    {
        String a = "Nate";
        String b = "Nathan";
        String c = "Nathiignton";
        String d = "Nath";

        Set<String> myset = new HashSet<>();

        myset.add(a);
        myset.add(b);
        myset.add(c);
        myset.add(d);

        for (String s: myset)
        {
            System.out.println(s);
        }

    }
}
