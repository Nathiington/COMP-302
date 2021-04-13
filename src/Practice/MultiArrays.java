package Practice;

public class MultiArrays
{
    public static void main(String[] args)
    {
        int arr[][] = {{2,5,5,5},{2,6,7,8}};
        int sum = 0;

        for(int i=0; i<2 ; i++)
        {
            for(int j=0; j<4 ; j++)
            {
                sum+=arr[i][j];
            }

        }
        System.out.println("The sum is: "+ sum );
    }

}
