import java.util.*;
public class s4q2 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	   		
		int low,high,val,g;
        System.out.println("Enter a number greater than or equal 0 and less than or equal 100");
 		low = 0 ;
		high = 100 ;
		val = low + (int)(Math.random()*((high-low)+1));
		g=sc.nextInt();
		if (val <= g)
			System.out.println("your guess was greater than " + val);
		else   
			System.out.println("your gurss was less than " + val);
	 }
 }