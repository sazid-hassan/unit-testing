package bankdemo;

public class NotSufficientAmountException extends RuntimeException {
    public NotSufficientAmountException(String not_enough_balance) {
        super(not_enough_balance);
    }
}
