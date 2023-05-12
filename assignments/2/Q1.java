package assignment1;
import java.util.*; 
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double length;  
        double width;
        System.out.println("Enter length and width");
        length= sc.nextDouble();
        width = sc.nextDouble();
        double area= width*length;
        double perimeter= (width+length)*2;
        System.out.println("The area="+ area);
        System.out.println("The perimeter="+ perimeter);
	}

}
