


package Main;

public class Array1 {

    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0]=2;
        myArray[1]=25;
        myArray[2]=13;
        myArray[3]=20;
        myArray[4]=79;
        myArray[5]=6;
        myArray[6]=920;
        myArray[7]=85;
        myArray[8]=28;
        myArray[9]=33;
        //fori tab
        for(int i=0; i<myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        //fore tab
        for (int i : myArray) {
            System.out.println(i);
        }
    }
   
    
    
}
