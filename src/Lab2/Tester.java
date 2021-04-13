package Lab2;

import java.util.Date;

public class Tester
{
    public static void main(String[] args) {
        AccountPlus acc = new AccountPlus("Dork", 200);
        Trans t = new Trans(800, new Date());
        if (acc.checkTrans(t))
            acc.post(t);


        for(Object obj : acc.transv)
        {
            System.out.println(acc.name);
            System.out.println(acc.balance);
            System.out.println(acc.creditLimit);
        }


    }
}
