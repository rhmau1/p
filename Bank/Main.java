public class Main {
    public static void main(String[] args) {
        BankAccount account = new CustomerAccount("Fanum");
        try {
            account.deposit(40);
            System.out.println("Deposit 40 Success!");
            account.deposit(-32);
        } catch (InvalidDataException e) {
            System.out.println("Amount -32 is invalid!");
        }

        try {
            account.withdraw(34);
            System.out.println("Withdraw 34 Success!");
            account.withdraw(-2);
        } catch (InvalidDataException e) {
            System.out.println("Amount -2 is invalid!");
        } catch (Exception e) {}

        try {
            account.withdraw(20);
        } catch (InsufficientBalanceException e) {
            System.out.println("Balance is not enough");
        } catch (Exception e) {}

        // Expected Output:
        // =======================
        // Deposit 40 Success!
        // Amount -32 is invalid!
        // Withdraw 34 Success!
        // Amount -2 is invalid!
        // Balance is not enough
        // =======================
    }
}