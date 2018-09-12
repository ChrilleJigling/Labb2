
package Classes;

public class Fish extends Animal {

    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating for fuck sake");
    }

}
