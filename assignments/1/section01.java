import java.util.*;
public class section01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int product=0 ;
		int sum=0;
		System.out.println("Enter the length of the 1st and the 2nd vector");
		int N=sc.nextInt();
	    int[] vec1 = new int[N]; 
		System.out.println("Enter " + N + " elements of the 1st vector");
		
	    for (int i=0;i<N ;i++) {	    	
	    vec1[i]= sc.nextInt() ;	    	    	    
	}
	 System.out.println("Enter " + N + " elements of the 2nd vector");   
	    int[] vec2 = new int[N]; 		
	    for (int i=0;i<N ;i++) {	    	
	    vec2[i]= sc.nextInt() ;	    	    	    
	}
	    for (int i=0;i<N ;i++) {
	    	sum=vec1[i]*vec2[i];
	    		product +=sum; 	
	    }
	    System.out.println("the dot product of the the two vectors= " + product);
	}

}
