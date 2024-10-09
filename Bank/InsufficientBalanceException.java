public class InsufficientBalanceException extends Exception {
    InsufficientBalanceException() {
        super("Balance not enough");
    }
}