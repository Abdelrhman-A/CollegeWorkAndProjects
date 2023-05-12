package assignment1;
import java.util.*; 
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of sides and its length");
        double N,L,x,y,area;
        N=sc.nextDouble();
        L=sc.nextDouble();
       if (N>2) {
        x=(Math.pow(L,2))*N;
        y=(4*Math.tan(180/N));
        area=x/y;
        System.out.println("The area = "+ area);
       }
       else {
        System.out.println("The number of slides must be greater than 2");
        
        
        
       }
	}

}
