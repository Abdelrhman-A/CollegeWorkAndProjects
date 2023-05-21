import java.util.* ;
public class section0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0 ;
		System.out.println("Enter the number of the numbers you want");
		int N=sc.nextInt();
	    int[] x = new int[N]; 
		System.out.println("Enter " + N + " elements");
		
	    for (int i=0;i<N ;i++) {
	    	
	    x[i]= sc.nextInt() ;
	    sum+=x[i];	    
	    
	}
	    double mean= (double)sum/N ; 
System.out.println("the mean= "+ mean);
	double sum2=0 ;
		double z;
		
    for (int i=0;i<N ;i++) {	
    z=Math.pow(x[i]-mean,2) ;
     sum2 +=z;        
}
System.out.println("The standard deviation="+ Math.sqrt(sum2/N));	
	
	
	
	
	
	
	
	
	
	}	
}
