package basics.liskovPrinciple;

public class Owl extends Animal{
    @Override
    public void speak() {
        throw new RuntimeException("No voice");
    }
}
