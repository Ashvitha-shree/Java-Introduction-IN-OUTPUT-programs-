//Customer Support Ticket System

import java.util.*;
public class Main7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int ticketID=scan.nextInt();
        scan.nextLine();
        String customerName=scan.nextLine();
        String issueDescription=scan.nextLine();
        String priorityLevel=scan.nextLine().toUpperCase();
        if(!priorityLevel.equals("HIGH") && !priorityLevel.equals("MEDIUM") && !priorityLevel.equals("LOW")){
               System.out.println("Invalid priority level. Please enter High, Medium, or Low."); }   
        else if(ticketID%10==0 || ticketID%5!=0){
            System.out.println("Support Ticket:");
            System.out.println("Ticket ID: "+ticketID);
            System.out.println("Customer Name: "+customerName);
            System.out.println("Issue Description: "+issueDescription);
            System.out.println("Priority Level: "+priorityLevel);
        }    
        else{
        System.out.println();
        System.out.println("Support Ticket:");
        System.out.println("Ticket ID: "+ticketID);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Issue Description: "+issueDescription);
        System.out.println("Priority Level: "+priorityLevel);
    }}}

