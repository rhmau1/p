interface BankAccount {
    void deposit(double amount) throws InvalidDataException;
    void withdraw(double amount) throws InvalidDataException, InsufficientBalanceException;
}