import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        // Age - Adult , Teen
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Teen");
        }

        // marks - Grade A,B,C,D 
        int marks=sc.nextInt();
        if (marks >=90){
            System.out.println("A");
        }else if (marks >=70 && marks<90) {
            System.out.println("B");
        }else if (marks >=50 && marks<70){
            System.out.println("C");
        }else if (marks >=35 && marks<50){
            System.out.println("D");
        }else{
             System.out.println("Fail");
        }

        // get 3 integers print which is largest
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if (a>=b && a>=c){
             System.out.println("A is Largest"+": "+a);
        }else if(b>=c && b>=a){
            System.out.println("B is Largest"+": "+b);
        }else{
            System.out.println("C is Largest"+": "+c);
        } 

        // Another way to write
        if (a>=b){
            if (a>=c){
                System.out.println("A is Largest"+": "+a);
            }else if (c>=a){
                System.out.println("C is Largest"+": "+c);
            }
        }
        // Switch Case
        // big condition in if else we have to check lot of number of condition Solution is switch case statement,
        // A switch statement is a more structured alternative to an if-else ladder when there are multiple conditions to check. It matches the given value (switch expression) with predefined cases. If a case matches, the associated block of code is executed.

        // The break keyword prevents the execution from "falling through" to subsequent cases and ensures that only the matching case is executed.
        // If no case matches the switch expression, the default block (if provided) is executed.
        // Without a break, the execution will continue through the remaining cases until a break or the end of the switch block is encountered.
    
        // Day Numner print which Day of the week
        int DayNumber = sc.nextInt();

        switch(DayNumber){
            case 1:
                System.out.println("DayNumber: "+": "+DayNumber+" : "+" Monday.");
                break;
            case 2:
                System.out.println("DayNumber: "+": "+DayNumber+" : "+" Tuesday.");
                break;
            case 3:
                System.out.println("DayNumber: "+": "+DayNumber+" : "+" Wednesday.");
                break;
            case 4:
                System.out.println("DayNumber: "+": "+DayNumber+" : "+" Thursday.");
                break;
            case 5:
                System.out.println("DayNumber: "+": "+DayNumber+" : "+" Friday.");
                break;
            case 6:
                System.out.println("DayNumber: "+": "+DayNumber+" : "+" Saturday.");
                break;
            case 7:
                System.out.println("DayNumber: "+": "+DayNumber+" : "+" Sunday.");
                break;
            default:
                System.out.println("Wrong Input.");
        }
        
        
        
        
    }
}