package Lab4;

public class AssortedSorts
{
//    time complexity: O(n^2)
    public void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = arr.length -1; j >= i ; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

//    time complexity: O(n^2)
    public void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }


//    time complexity: O(m log(base)2 n - m indicating the total number of comparisons
//    single level: O(log n)
    public void mergeSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int mid = (left + right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merger(arr,left,right,mid);
        }
    }
    public void merger(int[] arr, int left, int right, int mid)
    {
        int[] arr2 = new int[(right-left +1)];
        int arr2Count = 0;
        int leftCount = left;
        int rightCount = mid + 1;

        while(leftCount <= mid && rightCount<= right)
        {
            if(arr[leftCount] <= arr[rightCount])
            {
                arr2[arr2Count++] = arr[leftCount++];
            }
            else
            {
                arr2[arr2Count++] = arr[rightCount++];
            }
        }

        if(leftCount > mid)
        {
            while(rightCount <= right)
            {
                arr2[arr2Count++] = arr[rightCount++];
            }
        }
        else
        {
            while(leftCount <= mid)
            {
                arr2[arr2Count++] = arr[leftCount++];
            }
        }

        for(arr2Count = 0; arr2Count < right-left+1; arr2Count++)
        {
            arr[left+arr2Count] = arr2[arr2Count];
        }
    }


    //time complexity: O(m log(base)2 n
    public void quickSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int pivot = parttition(arr,left,right);

            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }

    static int parttition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int x = left -1;

        for (int i = left; i < right ; i++)
        {
            if(arr[i] <= pivot)
            {
                x++;

                int temp;
                temp = arr[x];
                arr[x] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[x+1];
        arr[x+1]= arr[right];
        arr[right] = temp;

        return(x + 1);
    }
}
