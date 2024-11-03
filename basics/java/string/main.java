import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        String name="name1";
        String lname="lname1";

        String fullname = name + " " + lname; // concatenation

        name+= " " + "prakash"; // strings are immutable they never modify or can be changed , here new object will be created and name will be referenced to that object

        System.out.println(name);
        
        System.out.println(fullname);

        System.out.println(name.equals(fullname)); // compare string content

        System.out.println(name);

        System.out.println(name + " Has a Length := " + name.length());

        System.out.println(name.charAt(2));

        System.out.println(name.substring(4)); // 4th index to end 

        System.out.println(name.substring(4,5)); // 4th to 5th index , doesnt include the ending index 
        
    }
}