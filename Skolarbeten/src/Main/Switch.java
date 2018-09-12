package Main;

import javax.swing.JOptionPane;

public class Switch {

    public static void main(String[] args) {
        while (true) {
            String kommando = JOptionPane.showInputDialog("Ge mig ett kommando");
            switch (kommando) {
                case "sluta":
                    System.exit(0);
                    break;
                case "hej":
                    System.out.println("hej");
                    break;
                case "hejdå":
                    System.out.println("ses igen");
                    break;
                default:
                     System.out.println("Ge mig ett nytt kommando");
                    break;
            }
        }

    }
}