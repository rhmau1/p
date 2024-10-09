package inheritance;
public class Beast extends Creature{
    Beast(String name, int power){
        super(name, power);
    }
    public void roar(){
        System.out.println(name + " roars with strength of " + power);
    }
}
