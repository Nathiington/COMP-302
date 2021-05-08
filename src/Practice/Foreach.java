package Practice;

public class Foreach
{
    public static void main(String[] args)
    {
        int[] myArr = {1,2,3,4,5,6};
        int sum = 0;
        for (int x: myArr)
        {
            sum += x;
        }
        System.out.println(sum);
    }
}
