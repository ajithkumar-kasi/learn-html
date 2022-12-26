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
		System.out.println("right shift ");
		for(int i:b)
			System.out.print(i+" ");
		
		System.out.println(" ");
		System.out.println(" ******************************");
		
		
		
		
		
		
		
		//reverse
		
		int c[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("original array");
		for(int i:c)
			
		System.out.print(i+" ");
		System.out.println(" ");
		System.out.println("revrese array");
		
		
		
			for(int i=c.length-1;i>=0;i--) {
				System.out.print(c[i]+" ");
			}
			
			System.out.println(" ");
			
			System.out.println(" ******************************");
			
			
			//duplicate elements
			
			
			int dup[]= {1,2,3,4,2,6,3,84,1};
			System.out.println("original array");
			for(int i:dup)
				System.out.print(i+" ");
		
			System.out.println(" ");
			for(int i = 0;i<dup.length;i++) {
				for(int j=i+1;j<dup.length;j++) {
					if(dup[i]==dup[j])
						System.out.print(dup[j]+" ");
				}
			}
		
	
			
	}

}
