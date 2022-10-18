package BankAccountTest;

import bankdemo.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    @DisplayName("Account Created With Initial Balance")
    public void testBankAccount()
    {
        BankAccount account = new BankAccount();
        Assertions.assertNotNull(account);
    }

    @Test
    void depositTest() {
        BankAccount account = new BankAccount();
        account.deposit(10.5);
        Assertions.assertEquals(BigDecimal.valueOf(10.50), account.getBalance());
    }

    @Test
    void withdrawTeest()
    {
        //Initializing Account with some balance for withdraw
        BankAccount account = new BankAccount(1000.50);

        account.withdraw(100);

        Assertions.assertEquals(BigDecimal.valueOf(1000.50 - 100), account.getBalance());
    }
}