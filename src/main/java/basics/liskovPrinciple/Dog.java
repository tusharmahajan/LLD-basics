package basics.liskovPrinciple;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Bow Bow");
    }
}
