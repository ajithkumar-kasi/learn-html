package mypack1;

public class bigarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int a[]={1,2,3,4,5};
		int b[]=new int[10];
		for(i=0;i<a.length;i++) {
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
		a=b;
		b=null;
		System.out.println("");
		System.out.println(a.length);
		
	}
	

}
