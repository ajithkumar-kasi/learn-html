import java.math.*;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		int a,b,c;
		double r1,r2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 3 values:");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("Roots are "+r1+" and "+r2);
		
	}

}
