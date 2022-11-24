import java.util.Scanner;
public class pyramid {
	public static void main(String args[]) {
		int a=3,b=4,c;
		c=a+b+a++ + b++ + ++a+ ++b;
		a+=100;

		System.out.println(a);

		System.out.println(c);

	}

}
