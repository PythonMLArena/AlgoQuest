import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // next - Reads the next token (word) as a String. It stops reading input at whitespace (space, tab, newline).
        // nextint , nextDouble , NextBoolean - If the input doesn’t match these values, it throws an InputMismatchException. (reads int , Double , boolean as next token)
        // nextline - Reads an entire line of text as a String, including spaces.It stops reading input at the newline character,

        // Final Keyword 
        final int k = 10;
        //k+=10; //  cannot assign a value to final variable
        float newk=k; // implict Typecasting 
        
        System.out.println(k+" >> "+newk);
        int thirdk = (int) newk; // explicit typecasting = (int) newk
        System.out.println(k+" >> "+newk+" >> "+thirdk);
        

        
        String num=sc.nextLine();
        System.out.println(num);
        String num1=sc.nextLine();
        // Convert the String to an int
        int num2 = Integer.parseInt(num1); // explicit typecasting
        System.out.println(num2);


        // BufferedReader reads text more efficiently, making it faster for handling large amounts of data.
        // Scanner can parse primitive types and strings using regular expressions, while BufferedReader reads plain text only.
        // BufferedReader is more suitable when reading large files, whereas Scanner is more convenient for parsing smaller inputs.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter a line of text: ");
            String input = reader.readLine();
            System.out.println("You entered: " + input);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }


    
    }
}