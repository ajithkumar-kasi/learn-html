package mypack1;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a,b,c;
			a=60;
			b=2;
			c=a/b;
			System.out.println("the result is:"+c);

		}
		catch(ArithmeticException e) {
			System.out.println("Dividing by zero");
		}
		
	}

}
