package polymorphism;

public class Paypal implements Payment {
    @Override
    public void pay() {
        System.out.println("paid using paypal");
    }
}
