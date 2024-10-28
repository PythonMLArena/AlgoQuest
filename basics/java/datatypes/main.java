import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        byte bytenum =127;
        System.out.println(bytenum); // Comments: Range is -128 to 127 , 8 bits
        
        short shortnum =10;
        System.out.println(shortnum);  // Comments: Range is -32768 to 32767 , 16 bits
       
        int intnum =10;
        System.out.println(intnum);   // Comments: Range is -2^31 to 2^31 -1 , 32 bits (mostly used) , 10^9
      
        long longnum =10;
        System.out.println(longnum);  // Comments: Range is -2^63 to 2^63 -1 , 64 bits (mostly used) , More than 10^10

        float floatnum =10;
        System.out.println(floatnum);  // Comments: 6-7 decimal digits of precision , 32 bits (mostly used) 
        
        double doublenum =10;
        System.out.println(doublenum);  // Comments: 15 digit of precision is needed , 64 bits (mostly used) 

        char ch ='a';
        System.out.println(ch);  // Comments: Single quote needed else error

        boolean fl =true;
        System.out.println(fl);  // Comments: boolean either true or false

    }
}