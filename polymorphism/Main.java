package polymorphism;

public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditCard();
        payment.pay();
    }
}
