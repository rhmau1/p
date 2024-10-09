class CustomerAccount implements BankAccount {
    private double balance;
    private String accountHolder;
    // ^ kira2 ini apa? dan kenapa? 
    // private hanya bisa diakses di class CustomerAccount
    // protected bisa diakses di class CustomerAccount dan turunannya

    public CustomerAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public String getAccountHolder() {
        return accountHolder;
    }    

    @Override
    public void deposit(double amount) throws InvalidDataException {
        if (amount <= 0) {
            throw new InvalidDataException();
        }
        balance += amount;                    
    }

    @Override
    public void withdraw(double amount) throws InvalidDataException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidDataException();
        }
        if (balance < amount) {
            throw new InsufficientBalanceException();
        }
        balance -= amount;        
    }    
}