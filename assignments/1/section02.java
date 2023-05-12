import java.util.*;
public class section02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int N=sc.nextInt();
	    int[] x = new int[N]; 
		System.out.println("Enter " + N + " elements");		
		
	    for (int i=0;i<N ;i++) {	    	
	    x[i]= sc.nextInt() ;	    	   	    
	}
	   System.out.println("enter the number you want to search"); 
	   int search= sc.nextInt();
	   int index=0;
	   boolean k= true ;
	    for (int i=0;i<N ;i++) {	    		    	   	    
		    if (x[i]== search) {
		    	index = i ;
				System.out.println("the number "+ x[index]+ " is at index "+ index);
				k= false ;
		    break; }				    
		    
	            
		    } 	
	    if(k) {
	    	System.out.println("the number "+ search +" is not found");
		}
		
		
		
		
		
		
		
		
	
	}	
}