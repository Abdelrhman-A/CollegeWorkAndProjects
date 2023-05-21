package assignment1;
import java.util.*; 
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x2, x1, y2, y1,z2,z1");
        Double x2,x1,y2,y1,z2,z1;
         x2=sc.nextDouble();
         x1=sc.nextDouble();
         y2=sc.nextDouble();	 
         y1=sc.nextDouble();
         z2=sc.nextDouble();
         z1=sc.nextDouble();
         double a,b,c,d;
        a=Math.pow(x2 - x1,2); 
        b=Math.pow(y2 - y1,2);
        d=Math.pow(z2-z1,2);
        c=Math.sqrt(a+b+d);
         System.out.println("the distance="+ c);

	}

}
