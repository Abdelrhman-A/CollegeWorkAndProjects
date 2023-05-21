package study;
import java.util.*;
public class hoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a line");
        String C=sc.nextLine();        
        String lastWord = C.substring(C.lastIndexOf(" ")+1);                
        System.out.println(lastWord.length());
        System.out.println("The last word is "+ lastWord +" with length " + lastWord.length() );
        
        
	}

}
