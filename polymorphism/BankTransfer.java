package polymorphism;

public class BankTransfer implements Payment {
    @Override
    public void pay() {
        System.out.println("paid using bank transfer");
    }
}
