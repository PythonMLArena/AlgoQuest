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
        // matches the switch condition and execute all condition from the matching case
        // break keyword help and break the execute and move towards the end of program if needed
        // if no matching condition in switch then it went to the default and runs that
        // 
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