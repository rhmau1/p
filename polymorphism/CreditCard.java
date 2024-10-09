package polymorphism;

public class CreditCard implements Payment {    
    @Override
    public void pay() {
        System.out.println("paid using credit card");
    }
}
