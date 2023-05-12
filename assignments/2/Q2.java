package assignment1;
import java.util.*; 
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2");
        Double x2,x1,y2,y1;
         x1=sc.nextDouble();
         y1=sc.nextDouble();
         x2=sc.nextDouble();	 
         y2=sc.nextDouble();
         double m,a,b;
         a=(y2-y1);
         b=(x2-x1);
         m=a/b;
         System.out.println("the slope="+ m);
	}

}
