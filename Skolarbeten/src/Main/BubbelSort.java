
package Main;

public class BubbelSort {
    static int[] numbers = {23,45,10,67,41,33};
    public static void main(String[] args) {
        
        bubbleSortAscending();
        printArray();
    }
    private static void bubbleSortAscending() {
        int n = numbers.length;
        int temp;
        boolean swapped = false;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < (n-i); j++) {
                if(numbers[j-1]>numbers[j]) {
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                    break;
                }
            }
        
    }
    private static void printArray() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);   
        }
    }
    static void insertionSort() {
        
        for (int i = 1; i < numbers.length; i++) {
           int key = numbers[i];
           int j= i-1;
           int temp;
           while(j>=0 && key < numbers[j]) {
               temp = numbers[j];
               numbers[j] = numbers[j+1];
               numbers[j+1] = temp;
               j--;
           } 
        }
    }
}
