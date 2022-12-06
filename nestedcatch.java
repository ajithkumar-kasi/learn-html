package mypack1;

public class nestedcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12,3,45,6,0};
		try {
			int b;
			b=a[2]/a[1];
			System.out.println("the result.is"+b);
			
			try
			{
				System.out.println(a[7]);
			}
			catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("invalid index");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("dividing by zero");
			
		}
		
		
	
		
		
		
	}

}
