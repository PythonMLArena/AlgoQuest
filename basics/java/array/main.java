import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        // Store 10 Integers
        // datatypes store single values, to store 100 values we have containers called as Arrays
        int[] numbers = new int[10]; // container store same/single datatype values/items, 
        //10 length array is declared and initialize 10 integers with 0 in array, 
        //stored in contingous memory location
        // Zero Based Indexing

        System.out.println(Arrays.toString(numbers)); // to check all values in array
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        numbers[2]=2; // changed second index value to 2
        System.out.println(numbers[2]); // Runtime Error when Index go more than length

        // 2 D array
        int[][] numbers1 = {{1,2},{2,3},{2,3,4,5,9}};
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers1[2]));
        System.out.println(numbers1[2][3]);
        System.out.println(Arrays.toString(numbers1[0]));

        // length
        System.out.println(numbers.length);
        System.out.println(numbers1[2].length);
        
    }
}