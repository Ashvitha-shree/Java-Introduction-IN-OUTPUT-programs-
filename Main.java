//Sum of Digits of a Number

import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int sum=0;
       while(n>0){
        int rem=n%10;
        sum+=rem;
        n/=10;
        }
        System.out.print("The sum of the digits is: "+sum);
    }
}
