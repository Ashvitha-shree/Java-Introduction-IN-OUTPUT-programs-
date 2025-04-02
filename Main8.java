//Library Membership Form

import java.util.Scanner; 
public class Main8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        String memberName=scan.nextLine();
        int memberID=scan.nextInt();
        scan.nextLine();
        String membershipType=scan.nextLine();
        double subscriptionFee=scan.nextDouble();
        System.out.println("Library Membership Form:");
        System.out.println("Name: "+memberName);
        System.out.println("Membership ID: "+memberID);
        System.out.println("Membership Type: "+membershipType);
        System.out.printf("Subscription Fee: %.2f",subscriptionFee);
    }
}