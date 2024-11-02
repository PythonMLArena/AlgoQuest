import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        //  Arithmatic = + , - , * , / , %
        int num1=10;
        int num2=20;
        int numplus=num1+num2;
        System.out.println(numplus);
        int numminus=num1-num2;
        System.out.println(numminus);
        int nummulti=num1*num2;
        System.out.println(nummulti);
        int numdiv=num1 / num2;
        double numdiv2=num1 / num2;
        System.out.println(numdiv+" "+numdiv2);
        float nummod=num1 % num2;
        System.out.println(nummod);

        System.out.println("___________________UNARY OPERATORS___________________________");
        // Unary Operator +, - ,++,--
        System.out.println(-num1);
        System.out.println(--num2);  // pre decrement ->  first decrement then do any operation
        System.out.println(num1++);  // post increment ->  first do operation then increment
        System.out.println(num2--);  // post decrement ->  first do operation then decrement

       

        int number1=6;
        int number2=++number1;

        int number3=number2++;

        int number4=number3--;

        int number5=--number4;

        System.out.println(number1); // 7

        System.out.println(number2); // 8

        System.out.println(number3); // 6

        System.out.println(number4); // 6

        System.out.println(number5); //  6


        ////////////////////// RELATIONAL OPERATORS ////////////////////////
        System.out.println("___________________RELATIONAL OPERATORS___________________________");

        // == , != , > , < , >= , <= 

        System.out.println("num1: " + num1 + " num2: " + num2 + " == " + (num1 == num2));
        System.out.println("num1: " + num1 + " num2: " + num2 + " != " +(num1!=num2));
        System.out.println("num1: " + num1 + " num2: " + num2 + " >+ " +(num1>=num2));
        System.out.println("num1: " + num1 + " num2: " + num2 + " <+ " +(num1<=num2));
        System.out.println("number4: " + number4 + " number5: " + number5 + " == " +(number4==number5));

        ////////////////////// LOGICAL OPERATORS ////////////////////////
        System.out.println("___________________LOGICAL OPERATORS___________________________");

        // && (and) ,|| (or)
        boolean logic1=true;
        boolean logic2=false;
        System.out.println("logic1: " + logic1 + " logic2: " + logic2 + " && Answer:" + (logic1 && logic2));
        System.out.println("logic1: " + logic1 + " logic2: " + logic2 + " || Answer:" +(logic1||logic2));

         ////////////////////// Assignment OPERATORS ////////////////////////
        System.out.println("___________________Assignment OPERATORS___________________________");

        // = , += , -=m, *= , /= , %=
        int num4=0;
        int num5=0;
        num5=num1+num2;
        num4+=num5; // num4 = num4+num5
        num4-=num5; // num4 = num4-num5
        num4*=num5; // num4 = num4*num5
        num4/=num5; // num4 = num4/num5
        num4%=num5; // num4 = num4%num5

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num4);
        System.out.println(num5);

         ////////////////////// Ternary OPERATORS ////////////////////////
        System.out.println("___________________ Ternary OPERATORS___________________________");

        // condition ? first : second
        int num6=2;
        int num7=9;

        int result = num6 < num7 ? num6 : num7;
        int result1 = num6 > num7 ? num6 : num7;
      
        System.out.println(result);
        System.out.println(result1);
    
    }
}