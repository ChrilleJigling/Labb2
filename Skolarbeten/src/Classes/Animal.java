
package Classes;

public abstract class Animal {
    String name;
    int age;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
   abstract public void eat();
   // public void sleep() {
     //   System.out.println("The animal is sleeping");
  //  }
}
