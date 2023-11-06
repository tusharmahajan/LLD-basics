package basics.liskovPrinciple;

import java.util.ArrayList;
import java.util.List;

public class AnimalAction {

    static void performAction(List<Animal> animal) {
        for (int i = 0;i<animal.size();i++){
            animal.get(i).speak();
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        performAction(animals);
    }
}
