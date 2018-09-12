
package Main;

import javax.swing.JOptionPane;


public class Loops {


    public static void main(String[] args) {
        int needed = 90;
        int collected = 2;
        while(collected < needed) {
            String giftString = JOptionPane.showInputDialog("Please give");
            int gift = Integer.parseInt(giftString);
            collected += gift;
        }
        System.out.println("Du har fått ihop "+collected);
    }
    
}
