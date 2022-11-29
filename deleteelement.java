
public class deleteelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,4,5,6,8};
		int b[]=new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
				
		int m=2;
		for(int i=0;i<a.length;i++)
		{
			if(i<m) {
				b[i]=a[i];
			}
			else if(i==m)
			
				continue;
			else{
				b[i-1]=a[i];
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		
		}
		System.out.println("");
		
		
	}

}
