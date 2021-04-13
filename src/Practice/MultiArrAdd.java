package Practice;

public class MultiArrAdd
{
    public static void main(String[] args)
    {
        int arr1[][]= {{1,2},{3,4}};
        int arr2[][]= {{5,6},{7,8}};


        for(int i=0;i<2; i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(arr1[i][j]+arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
