package Classes;

import javax.swing.JOptionPane;

public class StringInput {

 
    public static void main(String[] args) {
     String inTalString = JOptionPane.showInputDialog("Ge mig ett tal:");
     int inTal = Integer.parseInt(inTalString);
    }
    
}
