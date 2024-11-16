import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number_of_Array=sc.nextInt();
        int[] num=new int[number_of_Array];
        int maxi=Integer.MIN_VALUE;

        for (int i=0;i<number_of_Array;i++){ // to take input
            num[i]=sc.nextInt();
            if (num[i] > maxi){ // maxi = Math.max(maxi, num[i]);
                maxi=num[i];
            }
            
        }
        int[] hashedArray=new int[maxi+1]; // created Hash Array
        for (int i=0;i<number_of_Array;i++){

            hashedArray[num[i]]+=1;
            
            
        }

        System.out.println(" Array : "+Arrays.toString(num)+" , MAX : "+maxi);
        System.out.println(" HashedArray : "+Arrays.toString(hashedArray));
        

        

        

        

        
    }
}