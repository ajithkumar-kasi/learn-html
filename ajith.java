import java.lang.*;
import java.util.Scanner;
public class ajith {

	public static void main(String[] args) {
		float b,h,a;
		System.out.println("Enter the base and height: ");
		
		Scanner sc=new Scanner(System.in);
		b=sc.nextFloat();
		h=sc.nextFloat();
		a=b*h/2;
		
		System.out.println("The area of triangle is: " + a);

	}

}
