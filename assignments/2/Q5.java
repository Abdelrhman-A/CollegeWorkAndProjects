package assignment1;
import java.util.*; 
public class Q5 {

	public static void main(String[] args) {
		System.out.println("Enter the triangle sides");
	    Scanner sc = new Scanner(System.in); 		
		double a,b,c,area,perimeter,s;
		a=sc.nextDouble();
        b=sc.nextDouble();
        c= sc.nextDouble();
        perimeter= a+b+c;
        s = perimeter/2;
        area = Math.pow((s*(s-a)*(s-b)*(s-c)), 0.5);
        System.out.println("the area="+ area) ;
        System.out.println("the perimeter="+ perimeter) ;
	}

}

