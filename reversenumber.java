package mypack1;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=56784367;
		int b=0;
		
		System.out.println("The original number is:"+a);
		
		while(a!=0) {
			
			int r=a%10;
			b=b*10+r;
			a=a/10;
		}
		System.out.println("The reverse number is:"+b);
		}

}
