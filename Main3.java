//Basic Arithmetic Operations

import java.util.*;
public class Main3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       int y = scan.nextInt();
       int add=x+y;
       System.out.println("Addition: " + add);
       int sub=x-y;
       System.out.println("Subtraction: " + sub);
       int multi=x*y;
       System.out.println("Multiplication: " + multi);
       if(y!=0){
        int div=x/y;
        System.out.println("Division: " + div);
     }
    else{
       
        System.out.println("Division: Error - Division by zero is not allowed.");
    }
    scan.close();
}}
