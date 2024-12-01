import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // first initialization
        // then condition check
        // Do the job inside Curly braces
        // then increment (can be skipped but INFINITE LOOP)
        for(int x=1;x<=10;x+=2){
            System.out.println("This is my name");
            
        }
        // 
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        int[] arr1=new int[num];

        for(int i=0;i<num;i++){

            arr1[i]=sc.nextInt();
            
        }
      
        System.out.println(Arrays.toString(arr1));

        // for each loop
        for (int itr:arr1){
            System.out.print(itr + " ");
        }
        System.out.println();

        // Exception Handling
        try {
            int new1=10;
            int new2=0;
            int new3=new1/new2;
            System.out.println(new3);
            
        } catch (Exception e){
            System.out.println(e);
        } finally {
             System.out.println("Always Executed this");
        }
       
        

        
    }
}