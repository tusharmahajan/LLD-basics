package basics.liskovPrinciple;

public class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }
}
