//Personalized Greeting Card Generator

import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      String input=scan.nextLine();
      String[] parts=input.split(",");
      if(parts.length!=4){
        System.out.println("Invalid input format.");
        return;
      }
      String recipientName=parts[0].trim();
      String occasion=parts[1].trim();
      String message=parts[2].trim();
      String sophieName=parts[3].trim();
      String occasionmessage="";
      switch(occasion){
        case "Birthday":{
          occasionmessage="Happy Birthday!";
          break;
        }
        case "Graduation":{
          occasionmessage="Happy Graduation!";
          break;
        }
        case "Anniversary":{
          occasionmessage="Happy Anniversary!";
          break;
        }
        default:{
          occasionmessage="Happy "+occasion+"!";
          break;
        }}
        if(occasionmessage=="Happy Birthday!" || occasionmessage=="Happy Anniversary!"){
          System.out.printf("To: %s,%s,%s,From,,%s,%n",recipientName,occasionmessage,message,sophieName);
        }
        else{
          System.out.printf("To: %s,%s,%s,From: %s,%n",recipientName,occasionmessage,message,sophieName);
        }
          
}
}
