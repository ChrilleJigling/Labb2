
package Classes;

public class Cat extends Animal {
    int whiskers;
    
    public Cat(String name, int age, String color, int whiskers) {
        super(name, age, color);
        this.whiskers = whiskers;
    }
    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }
}
