package mypack1;

public class swapmethod {
	
 static void swap(int a,int b) {
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+","+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		swap(12,4);
	}

}
