import java.util.*;
import java.lang.*;
import java.io.*;

class Test {
    public static void printNew(){
        System.out.println("New");
        
    }
}

class Test2{
    
    public void printNew(){
        System.out.println("new");
    }
}

// The main method must be in a class named "Main".
class Main {
    private void printnewv2(){
        System.out.println("new private one");
    }
    private static void kmp1(){
        System.out.println("Static private");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Test.printNew();
        //Test2.printNew(); // it wont work for Non Static method called in static main , here you need to create object
        Test2 t1 = new Test2();
        t1.printNew(); // like this
        Main m1 = new Main(); // here private method dont have static so created object to access method
        m1.printnewv2();
        kmp1(); // No main object needed here

        
        
    }
}