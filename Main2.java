//Calculating the Factorial of a Number

import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int fact=1;
        if(n==0){
            System.out.print("The factorial of "+n+" is 1");
        }
        else if(n==1){
            System.out.print("The factorial of "+n+" is 1");
        }
        else{
        for (int i=1;i<=n;i++ ){
            fact=fact*i;
        }
        System.out.print("The factorial of "+n+" is "+fact);
        }
    }
}