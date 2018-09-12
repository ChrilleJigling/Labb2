
package Classes;

public class Horse extends Animal{
    
    
    public Horse(String name, int age, String color) {
        super(name, age, color);
    }
    @Override
    public void eat() {
        System.out.println("The horse is eating");
    }
}
