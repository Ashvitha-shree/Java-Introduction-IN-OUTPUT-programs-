//Hotel Booking System with Special Requests

import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String guestName=scan.nextLine();
        String roomType=scan.nextLine();
        int numberOfNights=scan.nextInt();
        scan.nextLine();
        String specialRequests=scan.nextLine();
        System.out.printf("Hotel Booking Confirmation:\nGuest Name: %s\nRoom Type: %s\nNumber of Nights: %d\nSpecial Requests: %s\n",guestName,roomType,numberOfNights,specialRequests);

    }
}
