package Lab4;

import java.util.Arrays;

public class Tester
{
    public static void main(String[] args)
    {
        AssortedSorts myPhone = new AssortedSorts();
        int[] myArray = {1,5,6,7,3,4,9,110,2,23,34,65,61,78,8,99,10,44};
        int size = myArray.length;

        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(myArray));
        System.out.println("Quick Sort:");
        myPhone.quickSort(myArray,0,size-1);
        System.out.println(Arrays.toString(myArray));


        System.out.println("\nUnsorted array");
        int[] myArray2 = {1,5,6,7,3,4,9,110,2,23,34,65,61,78,8,99,10,44};
        System.out.println(Arrays.toString(myArray2));
        System.out.println("Merge Sort");
        myPhone.mergeSort(myArray2,0,size-1);
        System.out.println(Arrays.toString(myArray2));

        System.out.println("\nUnsorted array");
        int[] myArray3 = {1,5,6,7,3,4,9,110,2,23,34,65,61,78,8,99,10,44};
        System.out.println(Arrays.toString(myArray3));
        System.out.println("Bubble Sort");
        myPhone.bubbleSort(myArray3);
        System.out.println(Arrays.toString(myArray3));

        System.out.println("\nUnsorted array");
        int[] myArray4 = {1,5,6,7,3,4,9,110,2,23,34,65,61,78,8,99,10,44};
        System.out.println(Arrays.toString(myArray4));
        System.out.println("Insertion Sort");
        myPhone.insertionSort(myArray4);
        System.out.println(Arrays.toString(myArray4));

    }
}
