package mypack1;

public class defaultt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//leftshift
		int a[]= {1,2,3,4,6,7,8}; 
		System.out.println("original array");
		for(int i:a)
			
		System.out.print(i+" ");
		
		int n=2;
		
		for (int j=0;j<n;j++) {
			int temp=a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i]=a[i+1];
			}
				a[a.length-1]=temp;
		}
		
		System.out.println(" ");
		System.out.println("left shift ");
		for(int i:a)
			System.out.print(i+" ");

		System.out.println(" ");
		System.out.println("**************************** ");
		//rightshift
		int b[]= {1,2,3,4,6,7,8}; 
		System.out.println("original array");
		for(int i:b)
			
		System.out.print(i+" ");
		
		
		
		for (int j=0;j<n;j++) {
			int temp=b[b.length-1];
			for(int i=b.length-1;i>0;i--) {
				b[i]=b[i-1];
			}
				b[0]=temp;
		}
		
		System.out.println(" ");
		System.out.println("left shift ");
		for(int i:b)
			System.out.print(i+" ");
	}

}
