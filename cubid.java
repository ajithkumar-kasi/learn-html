import java.math.*;
import java.util.Scanner;
public class cubid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,b,h;
		int area,volume;
		System.out.println("enter the l,b,h:");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		area=2*((l*h)+(h*b)+(l*b));
		volume=l*b*h;
		System.out.println("The total area is: "+area);
		System.out.println("The volume is: "+volume);
	}

}
