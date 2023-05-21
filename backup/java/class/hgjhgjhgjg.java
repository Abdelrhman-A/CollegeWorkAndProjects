import java.util.*;
public class hgjhgjhgjg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter x2, x1, y2, y1");
        Double x2,x1,y2,y1;
         x2=sc.nextDouble();
         x1=sc.nextDouble();
         y2=sc.nextDouble();	 
         y1=sc.nextDouble();	
         double a,b,c;
        a=Math.pow(x2 - x1,2); 
        b=Math.pow(y2 - y1,2);
        c=Math.sqrt(a+b);
         System.out.println("The distance = " + c);
	}

}
