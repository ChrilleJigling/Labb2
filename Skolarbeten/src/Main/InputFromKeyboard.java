
package Main;

import java.util.Scanner;

public class InputFromKeyboard {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.nextLine();
        System.out.println("Your name is "+name);
        
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("You are "+age+" years old");
        sc.nextLine(); //Rensar Cachen, går ej gå från nextInt till nextLine i Scanner
        System.out.println("How are you today");
        String mood = sc.nextLine();
        System.out.println("You feel "+mood);
    }
    
}
