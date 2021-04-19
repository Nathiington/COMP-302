package Lab3;

import java.util.*;

public class Exercise3
{
    public static void main(String[] args)
    {
        //3.1
        Map<String,Integer> mymap = new HashMap<>();

        mymap.put("Mandela",95);
        mymap.put("Ronaldo",31);
        mymap.put("Covid",1);
        mymap.put("Franco",55);
        mymap.put("Peter",32);
        mymap.put("Trump",77);
        mymap.put("Ted",24);

        //3.2
        System.out.println("Mandela is "+ mymap.get("Mandela"));

        //3.3
        for(Map.Entry<String,Integer> x: mymap.entrySet())
        {
            String name = x.getKey();
            Integer age = (Integer)x.getValue();

            System.out.println(name + ":" + age);
        }
        //3.4
//        mymap.remove("Covid");
//        mymap.remove("Peter");
//        System.out.println(mymap);
        //3.5
        if (mymap.containsKey("Covid"))
        {
            System.out.println("Batswana re padile");
        }
        else
        {
            System.out.println("Re o kgonne segajaja");
        }
        //3.6
        System.out.println("");
        Map<String,Integer> mymap2 = new HashMap<>(mymap);
        mymap2.putAll(mymap);
        System.out.println(mymap2);
        //3.7
        int sum=0;
        for (Map.Entry<String,Integer> x: mymap.entrySet())
        {
            sum += x.getValue();
        }
        System.out.println("Sum: "+ sum);
    }

}
