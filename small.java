package mypack1;

public class small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {23,4,34,6,7,55,2,8};
		int s=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(s>a[i]) {
				s=a[i];
			}
			
			
		}
		System.out.println(s);
	}

}
