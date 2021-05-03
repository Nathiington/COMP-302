package Practice;

import java.util.Arrays;
import java.util.Scanner;

//Binary Search takes an array, splits it into 2, then checks to see if the desired value is less than, greater than or equal to our desired number
//If it is greater than, the end of our array now becomes the midpoint and this process is repeated until the desired value is found
//If it is less than, the beginning of the array is shifted to the midpoint and the process is repeated

//the worst case is Math.log(2.0) n where n is the size of the array, in this case 4, meaning the code will take at most 4 cycles to find the desired value
//the best case is 1

public class BinarySearch
{
    static int search(int[] arr, int x)
    {
        int left = 0;
        int right = arr.length - 1;

        while (right > left)
        {
//        To calculate the midpoint of our array
            int mid = (right+left)/2;

//         To check if the midpoint of our array is our desired value
            if (arr[mid] == x)
            {
                return mid;
            }

//          To check if the value we want is in the left half of our array
            if (arr[mid] > x)
            {
                right = mid -1;
            }
//          Else our desired value is in the right half of the array
            else
            {
                left = mid +1;
            }

//          Checking if the desired number is first in the array
            if(arr[left] == x)
            {
                return left;
            }

//Repeat loop until our desired value is our mid
        }
//Then in our function we have a while loop to go through the array and return our desired value's index else return an arbitrary int
        return  -1;
    }
//    A different implementation to give the same result
//    static int ontySearch(int[] arr, int x)
//    {
//        int left = 0;
//        int right = arr.length -1;
//        int mid;
//
//        while (left<right)
//        {
//            mid = (left + right)/2;
//            if(x > arr[mid])
//            {
//                left = mid+1;
//            }
//            else
//            {
//                right = mid;
//            }
//        }
//
//        if (arr[left] == x)
//        {
//            return left;
//        }
//        else
//        {
//            return -1;
//        }
//    }

    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        int myArr[] = { 2, 3, 4, 10, 40,50,60,80,100,110,200,300,550,670,800,900};
        System.out.println(Arrays.toString(myArr));
        System.out.println("Select a number to locate the index");
        System.out.println(myArr.length);
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

//        System.out.println("Onty");
//        result = ontySearch(myArr,x);
//        if (result == -1)
//        {
//            System.out.println("Element is not in the array");
//        }
//        else
//        {
//            System.out.println("Element is at index: " + result);
//        }

    }
}
