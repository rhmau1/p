package inheritance;

public class Main {
    public static void main(String[] args) {        
        Beast beast = new Beast("Lion", 30);
        beast.roar();
        Bird bird = new Bird("Eagle", 20);
        bird.fly();
    }
}
