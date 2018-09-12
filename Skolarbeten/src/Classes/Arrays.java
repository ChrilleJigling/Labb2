
package Classes;

public class Arrays {


    public static void main(String[] args) {
        double [] temps;
        temps = new double[7];
        
        temps[3] = 63.9;
        temps[4] = 45.3;
        
        for(int i=0; i<7; i++) {
            System.out.println(temps[i]);
        }
        for(double d: temps) {
            System.out.println(d);
        }
    }
    
}
