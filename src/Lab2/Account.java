package Lab2;
import java.util.*;

public class Account
{
    String name;
    Vector transv;
    int balance;

    Account (String n)
    {
        transv = new Vector();
        balance = 0;
        name = n;
    }

    boolean checkTrans (Trans t)
    {
        return (balance + t.amount >= 0);
    }

    void post (Trans t)
    {
        transv.add (t);
        balance += t.amount;
    }
}

class Trans
{
    int amount;
    Date date;

    public Trans(int amount, Date date)
    {
        this.amount = amount;
        this.date = date;
    }
}

class AccountPlus extends Account
{
    int creditLimit;
    AccountPlus (String n, int c)
    {
        super (n);
        creditLimit = c;
    }

    boolean checkTrans (Trans t)
    {
        return (balance + creditLimit + t.amount >= 0);
    }

}

class Bank
{
    Account [] accounts;
    void chargeMonthlyFee () {
        for (int i = 0; i < accounts.length; i++) {
            Trans fee = new Trans (-1, new Date ());
            if (accounts[i].checkTrans (fee))
                accounts[i].post (fee);
        }
    }

}