package Main;

import Classes.Animal;
import java.util.ArrayList;
import Classes.Cat;
import Classes.Fish;
import Classes.Horse;

public class TestInheritance {

    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
//        Cat c1 = new Cat();
//        Horse h1 = new Horse();
//        Fish f1 = new Fish();
        zoo.add(c1);
        zoo.add(h1);
        zoo.add(f1);

        for (Animal animal : zoo) {
            animal.eat();
            
            }
        }
}
