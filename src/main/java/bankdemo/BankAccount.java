package bankdemo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BankAccount {
    private final DecimalFormat Money = new DecimalFormat("$#, ##0.00");

    private BigDecimal balance;

    public BankAccount(double initialBalance)
    {
        this();
        deposit(initialBalance);
    }

    public BankAccount()
    {
        balance = BigDecimal.ZERO;
    }
    public void deposit(double amount)
    {
        if (amount < 0)
        {
            throw new NegativeAmountException("Deposit amount can not be negative!");
        }

        this.balance = balance.add(BigDecimal.valueOf(amount));
    }

    public  void withdraw(double amount)
    {
        if (amount < 0)
        {
            throw new NegativeAmountException("Amount can not be negative!");
        }

        BigDecimal amountToWithdraw = BigDecimal.valueOf(amount);

        if(amountToWithdraw.compareTo(balance) > 0)
        {
            throw new NotSufficientAmountException("Not Enough Balance");
        }

        this.balance = balance.subtract(BigDecimal.valueOf(amount));
    }

    public BigDecimal getBalance()
    {
        return balance;
    }

    @Override
    public String toString()
    {
        return ("Balance : "+Money.format(balance));
    }
}
