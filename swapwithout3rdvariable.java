package mypack1;

public class swapwithout3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		a=15;
		b=45;
		
		System.out.println("Before Swap");
		System.out.println("a="+a+","+"b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		
		System.out.println("After Swap");
		System.out.println("a="+a+","+"b="+b);
	}

}
