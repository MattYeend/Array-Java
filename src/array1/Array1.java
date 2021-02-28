/*
    Author: Matt
    Title: Arrays
    Date: 15/02/17
    Version: 1.0
 */
package array1;

public class Array1 {

    public static void main(String[] args) {
        //declares an array of integers
        int[] anArray;
        
        //allocates memory for 10 integers
        anArray = new int[10];
        
        //initialize first element
        anArray[0] = 100;
        //initialize second element
        anArray[1] = 200;
        //And so on
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
       
        System.out.println("Element at index 0: " +anArray[0]);
        System.out.println("Element at index 1: " +anArray[1]);
        System.out.println("Element at index 2: " +anArray[2]);
        System.out.println("Element at index 3: " +anArray[3]);
        System.out.println("Element at index 4: " +anArray[4]);
        System.out.println("Element at index 5: " +anArray[5]);
        System.out.println("Element at index 6: " +anArray[6]);
        System.out.println("Element at index 7: " +anArray[7]);
        System.out.println("Element at index 8: " +anArray[8]);
        System.out.println("Element at index 9: " +anArray[9]);
        
        //Second Array
        int[] Array;
        
        Array = new int[3];
        
        Array[0] = 10;
        Array[1] = 11;
        Array[2] = 12;
        
        System.out.println("Second Array");
        System.out.println("Element at index 0: " + Array[0]);
        System.out.println("Element at index 1: " + Array[1]);
        System.out.println("Element at index 2: " + Array[2]);
        
        //Thrid Array
        int[] AnArray;
        
        AnArray = new int[5];
        
        AnArray[0] = 1;
        AnArray[1] = 2;
        AnArray[2] = 3;
        AnArray[3] = 4;
        AnArray[4] = 5;
        
        System.out.println("Third Array");
        System.out.println("Element at index 0: " + AnArray[0]);
        System.out.println("Element at index 1: " + AnArray[1]);
        System.out.println("Element at index 2: " + AnArray[2]);
        System.out.println("Element at index 3: " + AnArray[3]);
        System.out.println("Element at index 4: " + AnArray[4]);
    }
}
