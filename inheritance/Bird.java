package inheritance;
public class Bird extends Creature {
    Bird(String name, int power){
        super(name, power);
    }
    public void fly(){
        System.out.println(name + " flies to a height of " + power + " meters");
    }
}
