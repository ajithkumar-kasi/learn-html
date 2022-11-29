
public class rotatinganarrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= {1,2,3,45,6,7,8,9,81,91,89,100};
		
		/* LEFT SHIFT*/
		
			int n=3;
		for(int x:A)
		{
			System.out.print(x+" ");
		}
		System.out.println("");
		
		for(int j=0;j<n;j++)
		{
			int temp=A[0];

			for(int i=1;i<A.length;i++)
			{
				A[i-1]=A[i];
			}
			A[A.length-1]=temp;
		}
		
		
		/*right Shift
		
		int n=3;
		for(int x:A)
		{
			System.out.print(x+" ");
		}
		System.out.println("");
		
		for(int j=0;j<n;j++)
		{
			int temp=A[A.length-1];
			for(int i=A.length-1;i>0;i--)
			{
				A[i]=A[i-1];
			}
			A[0]=temp;
		}*/
		
		for(int x:A)
		{
			System.out.print(x+" ");
		}
		
	}

}
