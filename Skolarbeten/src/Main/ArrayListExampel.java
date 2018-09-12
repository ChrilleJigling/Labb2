
package Main;

import java.util.ArrayList;

public class ArrayListExampel {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Chrille");
        names.add("Nicke");
        names.add("Janne");
        names.add(1, "Matte");
        names.set(1, "bajsmacka");
       // ArrayList<String> names2 = names.clone();
        
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
            
        }
        
        for (String name : names) {
            System.out.println(name);
        }
        
        
    }

}
