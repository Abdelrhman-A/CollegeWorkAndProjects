import java.util.*;
public class s4q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter a,b and c");
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double s= (b*b-4*a*c);
        if (s>0) { 
        	System.out.println("the equation has 2 roots");
        }	else if (s==0) { 	
        	System.out.println("the equation has 2 roots and they are equal"); }
        else if (s<0)
            System.out.println("the equation has 2 roots and they are complex and different"); 
         
        double x1= (-b+Math.sqrt(s))/2*a ;
        double x2= (-b-Math.sqrt(s))/2*a ;
        
        System.out.println("the first root is " + x1);
        System.out.println("the second root is " + x2);        
	

  } }