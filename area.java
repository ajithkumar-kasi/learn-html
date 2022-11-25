import java.math.*;
import java.util.Scanner;
public class area {

	public static void main(String[] args) {
		int a,b,c;
		float s;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of three sides:");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	   
	    s=(a+b+c)/2;
	    area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	    System.out.println("the area is: "+ area);
	}

}
