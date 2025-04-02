//Event RSVP System

import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String attendeeName= scan.nextLine();
        
        boolean isAttending=scan.nextBoolean();
        int numberOfGuests=scan.nextInt();
        System.out.println("RSVP Confirmation:");
        System.out.println( "Attendee Name: "+attendeeName);
        System.out.println("Attending: "+isAttending);
        System.out.println("Number of Guests: "+numberOfGuests);
    }
}
