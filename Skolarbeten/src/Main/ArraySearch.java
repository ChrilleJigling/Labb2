


package Main;

public class ArraySearch {
    static int[] talen = {2,5,89,3,7,8};
    public static void main(String[] args) {
        
        System.out.println("Biggest: "+findMax());
        System.out.println("Smallest: "+findMin());
    
    }
    public static int findMax2(int tal1, int tal2, int tal3) {
        int max = tal1;
        if(tal2>max) {
            max=tal2;
        }
        if(tal3>max){
            max=tal3;
        }
        return max;
    }
    public static int findMax() {
        int max = 0;
        for (int i = 1; i < talen.length; i++) {
            if(talen[i] > talen[max]) {
                max = i;
            }           
        } 
        return talen [max];
     }
    public static int findMin() {
        int min = 0;
        for (int i = 1; i < talen.length; i++) {
           if(talen[i] < talen[min]) {
               min = i;
           }
        }
        return talen[min];
    }
}
