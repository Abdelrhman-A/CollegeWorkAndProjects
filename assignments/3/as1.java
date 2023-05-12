package study;
import java.util.*;
public class as1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
		
		   int balance= 5000 ;
	       
           while (true) {              
        	   System.out.print("Enter 1 to Withdraw money \nEnter 2 to Deposit the money \nEntre 3 Check the balance \nEnter 4 Exit \n");
        	   int choice =sc.nextInt();
    	       
           switch (choice) {
           case (1):
        	   System.out.println("Enter money to be withdrawn");
               int Wmoney= sc.nextInt();
           	   balance -= Wmoney;  
           	   System.out.println("Collect your money");
           	   break;
           case (2):  	
               System.out.println("Enter the money to be deposited");
               int Dmoney= sc.nextInt();
               balance += Dmoney;
               break;
           case (3):    
        	   System.out.println("Your Balance: "+ balance);
               break;
           case (4):    
               System.out.println("GoodBye");
           System.exit(0);  
           default:
        	   System.out.println("enter a vaild choice");
            	

           
}
       
           
}	
		
	
}
}

