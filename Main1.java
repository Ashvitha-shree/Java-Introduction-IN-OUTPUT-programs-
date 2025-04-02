//Checking for Prime Numbers

import java.util.*;
public class Main1 {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int c=0;
      for(int i=1;i<=n;i++){
        if(n%i==0){
            c++;
        }
      }
      if(n!=1&&c<=2){
        System.out.print(n+" is a prime number.");
      }
      else if(c>2||n==1){
        System.out.print(n+" is not a prime number.");
      }
      else{
        System.out.print(n+" is neither prime nor composite.");
      }
    }
}
