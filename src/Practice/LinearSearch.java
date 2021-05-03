package Practice;

import java.util.*;

//Searches ka Setswana
//Goes through the array to locate the item you input for it to search
//The worst case is n where n is the size of the array
//The best case is 1

public class LinearSearch
{
//Search function where we pass an array and the number we want in the array as arguments
//Then in our function we have a for loop to go through the array and return our desired value's index else return an arbitrary int
    public static int search(int[] arr, int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
            {
                return  i;
            }
        }
        return -1;
    }


//tester
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        int[] myArr = {5,12,23,2,3,4,34,45,67};
        System.out.println(Arrays.toString(myArr));
        System.out.println("Select a number to locate the index");
        int x = scanf.nextInt();

        int result = search(myArr,x);
        if (result == -1)
        {
            System.out.println("Element is not in the array");
        }
        else
        {
            System.out.println("Element is at index: " + result);
        }

    }
}
